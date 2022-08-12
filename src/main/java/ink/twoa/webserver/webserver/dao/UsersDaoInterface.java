package ink.twoa.webserver.webserver.dao;

import ink.twoa.webserver.webserver.crud.UsersEntity;

import java.util.List;

public interface UsersDaoInterface {

    public List<UsersEntity> getAllUsers();

    public void saveUser(UsersEntity users);

    public UsersEntity getUser(Long id);

    public void deleteUser(Long id);
}
