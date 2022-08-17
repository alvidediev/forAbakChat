package ink.twoa.webserver.webserver.controller;

import ink.twoa.webserver.webserver.model.entity.UsersEntity;
import ink.twoa.webserver.webserver.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class UsersController {

    @Autowired
    private UsersServiceImpl usersService;


    @GetMapping("/users")
    public Iterable<UsersEntity> showAllUsers() {
        return usersService.getAllUsers();
    }

    @PostMapping("/users")
    public UsersEntity saveUser(@RequestBody UsersEntity usersEntity){
        usersService.saveUser(usersEntity);
        return usersEntity;
    }

    @GetMapping("/users/{id}")
    public Optional<UsersEntity> getUserById(@PathVariable Long id) {
        return usersService.findUserById(id);
    }


    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable Long id){
        usersService.deleteUserById(id);
        return "User with id " + id + "was deleted!";
    }
}
