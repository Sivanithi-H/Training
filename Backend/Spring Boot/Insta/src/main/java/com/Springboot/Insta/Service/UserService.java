package com.Springboot.Insta.Service;

import com.Springboot.Insta.Repo.UserRepo;

import com.Springboot.Insta.Service.Validation.CreateUserValidator;
import com.Springboot.Insta.Service.Validation.IdAndNameValidator;
import com.Springboot.Insta.pojo.UserProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepo userRepo;
    @Autowired
    IdAndNameValidator idAndNameValidator;

    @Autowired
    CreateUserValidator createUserValidator;

    public UserProfile getOneUserId(String userId) throws Exception{
        idAndNameValidator.preValidateUserId(userId);
        return userRepo.getOneUserId(userId);
    }

    public UserProfile getOneUserName(String name) throws Exception {
        idAndNameValidator.preValidateUserName(name);
        return userRepo.getOneUserName(name);
    }

    public void createUser(UserProfile newUser) throws Exception {
        createUserValidator.preValidateUser(newUser);
        userRepo.createUser(newUser);
    }

    public void deleteUser(String userId) throws Exception {
        idAndNameValidator.isIdExist(userId);
        userRepo.deleteUser(userId);
    }



}
