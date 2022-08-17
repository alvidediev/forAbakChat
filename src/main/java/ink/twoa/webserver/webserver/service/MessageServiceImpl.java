package ink.twoa.webserver.webserver.service;

import ink.twoa.webserver.webserver.model.entity.MessageEntity;
import ink.twoa.webserver.webserver.repository.MessagesCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MessageServiceImpl {

    @Autowired
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
