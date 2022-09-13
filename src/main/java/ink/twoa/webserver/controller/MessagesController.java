package ink.twoa.webserver.controller;

import ink.twoa.webserver.model.entity.MessageEntity;
import ink.twoa.webserver.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static ink.twoa.webserver.util.Constants.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MessagesController {

    private MessageService msgService;

    @GetMapping(value = SHOW_ALL_MESSAGES)
    public Iterable<MessageEntity> showAllMessages(){
        return msgService.getAllMessages();
    }

    @GetMapping(value = GET_MESSAGE_BY_ID)
    public Optional<MessageEntity> getMessageById(@PathVariable Long id){
        return msgService.findMsgById(id);
    }

    @PostMapping(value = SAVE_MESSAGE)
    public MessageEntity saveMessage(@RequestBody MessageEntity msgEntity){
        msgService.saveMessage(msgEntity);
        return msgEntity;
    }
}
