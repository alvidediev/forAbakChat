package ink.twoa.webserver.controller;

import ink.twoa.webserver.model.entity.UsersEntity;
import ink.twoa.webserver.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static ink.twoa.webserver.util.Constants.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UsersController {

    private UsersService usersService;


    @GetMapping(value = SHOW_USERS)
    public Iterable<UsersEntity> showAllUsers() {
        return usersService.getAllUsers();
    }

    @PostMapping(value = SAVE_USER)
    public UsersEntity saveUser(@RequestBody UsersEntity usersEntity){
        usersService.saveUser(usersEntity);
        return usersEntity;
    }

    @GetMapping(value = GET_USER_BY_ID)
    public Optional<UsersEntity> getUserById(@PathVariable Long id) {
        return usersService.findUserById(id);
    }


    @DeleteMapping(value = DELETE_USER_BY_ID)
    public String deleteUserById(@PathVariable Long id){
        usersService.deleteUserById(id);
        return "User with id " + id + "was deleted!";
    }
}
