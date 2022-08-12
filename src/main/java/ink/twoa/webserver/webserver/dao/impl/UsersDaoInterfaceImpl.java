package ink.twoa.webserver.webserver.dao.impl;

import ink.twoa.webserver.webserver.crud.UsersEntity;
import ink.twoa.webserver.webserver.dao.UsersDaoInterface;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UsersDaoInterfaceImpl implements UsersDaoInterface {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List getAllUsers() {
        Session session = entityManager.unwrap(Session.class);

        Query query = session.createQuery("from UsersEntity", UsersEntity.class);

        return query.getResultList();
    }

    @Override
    @Transactional
    public void saveUser(UsersEntity users) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(users);
    }

    @Override
    @Transactional
    public UsersEntity getUser(Long id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(UsersEntity.class, id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        Session session = entityManager.unwrap(Session.class);

        Query query = session.createQuery("delete from UsersEntity where userId =: id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
