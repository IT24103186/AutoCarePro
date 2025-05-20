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
        return userService.registerUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id")int id ,@RequestBody User user) {
        userService.updateUser(user, id);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")int id) {
        userService.deleteUser(id);
    }
}
