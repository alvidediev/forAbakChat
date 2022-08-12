package ink.twoa.webserver.webserver.dao.impl;

import ink.twoa.webserver.webserver.crud.MessageEntity;
import ink.twoa.webserver.webserver.dao.MessagesDaoInterface;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MessagesDaoInterfaceImpl implements MessagesDaoInterface {

    @Autowired
    private EntityManager entityManager;


    @Override
    @Transactional
    public void saveMessage(MessageEntity msgEntity) {
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(msgEntity);

    }

    @Override
    @Transactional
    public MessageEntity getMessageFromBase(Long id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(MessageEntity.class, id);

    }

    @Override
    @Transactional
    public List showAllMessages() {
        Session session = entityManager.unwrap(Session.class);

        Query query = session.createQuery("from MessageEntity", MessageEntity.class);

        return query.getResultList();
    }


}
