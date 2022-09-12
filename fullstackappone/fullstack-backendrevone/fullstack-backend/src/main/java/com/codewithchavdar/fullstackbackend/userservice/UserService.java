package com.codewithchavdar.fullstackbackend.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithchavdar.fullstackbackend.model.User;
import com.codewithchavdar.fullstackbackend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User newUser) {
        return userRepository.save(newUser);
    }

}
