package ink.twoa.webserver.webserver.service.imlp;

import ink.twoa.webserver.webserver.crud.MessageEntity;
import ink.twoa.webserver.webserver.dao.impl.MessagesDaoInterfaceImpl;
import ink.twoa.webserver.webserver.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessagesDaoInterfaceImpl msgDao;

    @Override
    @Transactional
    public List<MessageEntity> showAllMessages() {
        return msgDao.showAllMessages();
    }

    @Override
    @Transactional
    public void saveMessage(MessageEntity msgEntity) {
        msgDao.saveMessage(msgEntity);
    }

    @Override
    @Transactional
    public MessageEntity getEntityMsg(Long id) {
        return msgDao.getMessageFromBase(id);
    }
}
