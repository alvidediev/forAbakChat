package ink.twoa.webserver.webserver.controller;

import ink.twoa.webserver.webserver.model.entity.MessageEntity;
import ink.twoa.webserver.webserver.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class MessagesController {

    @Autowired
    private MessageServiceImpl msgService;

    @GetMapping("/msg")
    public Iterable<MessageEntity> showAllMessages(){
        return msgService.getAllMessages();
    }

    @GetMapping("/msg/{id}")
    public Optional<MessageEntity> getMessageById(@PathVariable Long id){
        return msgService.findMsgById(id);
    }

    @PostMapping("/msg")
    public MessageEntity saveMessage(@RequestBody MessageEntity msgEntity){
        msgService.saveMessage(msgEntity);
        return msgEntity;
    }
}
