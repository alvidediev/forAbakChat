package ink.twoa.webserver.webserver.controller;

import ink.twoa.webserver.webserver.crud.MessageEntity;
import ink.twoa.webserver.webserver.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MessagesController {

    @Autowired
    private MessageServiceImpl msgService;

    @GetMapping("/msg")
    public List<MessageEntity> showAllMessages(){
        List<MessageEntity> messages = msgService.showAllMessages();
        return messages;
    }

    @GetMapping("/msg/{id}")
    public MessageEntity getMessage(@PathVariable Long id){
        return msgService.getEntityMsg(id);
    }

    @PostMapping("/msg")
    public MessageEntity saveMessage(@RequestBody MessageEntity msgEntity){
        msgService.saveMessage(msgEntity);
        return msgEntity;
    }
}
