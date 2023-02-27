package com.example.SpringSecurity.service;

import com.example.SpringSecurity.pojo.User;
import com.example.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public void createUser(User user) {
        userRepo.createUser(user);
    }

    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }
}
