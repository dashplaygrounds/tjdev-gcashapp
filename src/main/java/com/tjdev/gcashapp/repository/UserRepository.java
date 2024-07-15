package com.tjdev.gcashapp.repository;

import com.tjdev.gcashapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByEmail(String email);
    List<User> findByNumber(Long number);
}