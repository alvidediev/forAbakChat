package ink.twoa.webserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ink.twoa.webserver.model.entity.UsersEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Data
public class KafkaService {

    private final KafkaTemplate<Long, UsersEntity> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public void send(UsersEntity users){
        kafkaTemplate.send("msg", users);
    }

    @KafkaListener(id = "Users", topics = {"msg"}, containerFactory = "singleFactory")
    public void consume(UsersEntity users){
        log.info("=> consumed{}", writeValueAsString(users));
    }

    private String writeValueAsString(UsersEntity users){
        try {
            return objectMapper.writeValueAsString(users);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
