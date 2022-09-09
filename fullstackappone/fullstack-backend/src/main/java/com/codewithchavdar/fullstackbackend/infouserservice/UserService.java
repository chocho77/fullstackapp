package com.codewithchavdar.fullstackbackend.infouserservice;

import com.codewithchavdar.fullstackbackend.model.User;
import com.codewithchavdar.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User save(User newUser){

        return userRepository.save(newUser);

    }

    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

}
