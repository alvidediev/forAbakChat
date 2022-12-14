package ink.twoa.webserver.service;

import ink.twoa.webserver.model.entity.MessageEntity;
import ink.twoa.webserver.repository.MessagesCrudRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MessageService {

    private MessagesCrudRepository msgCrud;

    @Transactional
    public Iterable<MessageEntity> getAllMessages(){
        return msgCrud.findAll();
    }

    @Transactional
    public void saveMessage(MessageEntity msg){
        msgCrud.save(msg);
    }

    public Optional<MessageEntity> findMsgById(Long id) {
        return msgCrud.findById(id);
    }
}
