package com.codewithchavdar.fullstackbackend.controller;

import com.codewithchavdar.fullstackbackend.infouserservice.UserService;
import com.codewithchavdar.fullstackbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }



}
