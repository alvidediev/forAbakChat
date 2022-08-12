package ink.twoa.webserver.webserver.service;

import ink.twoa.webserver.webserver.crud.MessageEntity;

import java.util.List;

public interface MessageService {

    public List<MessageEntity> showAllMessages();

    public void saveMessage(MessageEntity msgEntity);

    public MessageEntity getEntityMsg(Long id);
}
