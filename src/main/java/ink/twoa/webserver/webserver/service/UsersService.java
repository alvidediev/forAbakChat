package ink.twoa.webserver.webserver.service;

import ink.twoa.webserver.webserver.crud.UsersEntity;

import java.util.List;

public interface UsersService {

    public List<UsersEntity> getAllUsers();

    public void saveUsers(UsersEntity users);

    public UsersEntity getUser(Long id);

    public void deleteUser(Long id);


}
