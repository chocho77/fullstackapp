package com.codewithchavdar.fullstackbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithchavdar.fullstackbackend.model.User;
import com.codewithchavdar.fullstackbackend.userservice.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }

}
