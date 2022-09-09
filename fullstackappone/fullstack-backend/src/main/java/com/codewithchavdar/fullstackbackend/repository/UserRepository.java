package com.codewithchavdar.fullstackbackend.repository;

import com.codewithchavdar.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
