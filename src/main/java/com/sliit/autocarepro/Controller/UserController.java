package com.sliit.autocarepro.Controller;

import com.sliit.autocarepro.Model.User;
import com.sliit.autocarepro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(@RequestBody User user) {
        return userService.registeruser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping(params = "id")
    public void deleteUser(@RequestParam int id) {
        userService.deleteUser(id);
    }
}
