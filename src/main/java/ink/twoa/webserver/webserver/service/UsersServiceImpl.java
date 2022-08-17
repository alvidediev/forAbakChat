package ink.twoa.webserver.webserver.service;

import ink.twoa.webserver.webserver.model.entity.UsersEntity;
import ink.twoa.webserver.webserver.repository.UsersCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UsersServiceImpl {

    @Autowired
    private UsersCrudRepository crud;

    @Transactional
    public Optional<UsersEntity> findUserById(Long id) {
        return crud.findById(id);
    }

    @Transactional
    public void saveUser(UsersEntity users) {
        crud.save(users);
    }

    @Transactional
    public Iterable<UsersEntity> getAllUsers() {
        return crud.findAll();
    }

    @Transactional
    public void deleteUserById(Long id) {
        crud.deleteById(id);
    }
}
