package gilleycro.softwarelse.se.showproject.controller;

import gilleycro.softwarelse.se.showproject.model.User;
import gilleycro.softwarelse.se.showproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello world";
    }

    @GetMapping("/listall")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/save")
    public void SaveUser(@RequestBody User user) {
        userService.saveUser(user);
    }


}
