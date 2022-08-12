package ink.twoa.webserver.webserver.service.impl;

import ink.twoa.webserver.webserver.crud.UsersEntity;
import ink.twoa.webserver.webserver.dao.impl.UsersDaoInterfaceImpl;
import ink.twoa.webserver.webserver.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDaoInterfaceImpl usersDAO;

    @Override
    @Transactional
    public List<UsersEntity> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUsers(UsersEntity users) {
        usersDAO.saveUser(users);
    }

    @Override
    @Transactional
    public UsersEntity getUser(Long id) {
        return usersDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        usersDAO.deleteUser(id);
    }
}
