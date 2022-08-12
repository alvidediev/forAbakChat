package ink.twoa.webserver.webserver.controller;

import ink.twoa.webserver.webserver.crud.UsersEntity;
import ink.twoa.webserver.webserver.service.imlp.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private UsersServiceImpl usersService;

    @GetMapping("/users")
    public List<UsersEntity> showAllUsers(){
        List<UsersEntity> allUsers = usersService.getAllUsers();
        return allUsers;
    }

    @PostMapping("/users")
    public UsersEntity addNewUser(@RequestBody UsersEntity usersEntity){
        usersService.saveUsers(usersEntity);
        return usersEntity;
    }

    @GetMapping("/users/{id}")
    public UsersEntity getUser(@PathVariable Long id){
        return usersService.getUser(id);
    }

    @PutMapping("/users")
    public UsersEntity updateUser(@RequestBody UsersEntity user){
        usersService.saveUsers(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id){
        usersService.deleteUser(id);
        return "User with id " + id + "was deleted!";
    }
}
