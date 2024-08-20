package com.marlisajp.booktok.controllers;

import com.marlisajp.booktok.models.LoginRequest;
import com.marlisajp.booktok.models.User;
import com.marlisajp.booktok.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/signup")
    public void createNewUser(@RequestBody User user){
        userService.createNewUser(user);
    }

    @PostMapping("/login")
    public Optional<User> loginUser(@RequestBody LoginRequest loginRequest){
        return userService.loginUser(loginRequest.getEmail(), loginRequest.getPassword());
    }

    @DeleteMapping(path = "/delete/{userId}")
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }
}
