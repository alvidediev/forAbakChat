package ink.twoa.webserver.webserver.dao;

import ink.twoa.webserver.webserver.crud.MessageEntity;

import java.util.List;

public interface MessagesDaoInterface {

    public void saveMessage(MessageEntity msgEntity);

    public MessageEntity getMessageFromBase(Long id);

    public List<MessageEntity> showAllMessages();

}
