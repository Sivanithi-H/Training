package com.Springboot.Insta.Service.Validation;

import com.Springboot.Insta.Repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IdAndNameValidator {

    @Autowired
    UserRepo userRepo;

    public void preValidateUserId(String userId) throws Exception {
        isIdExist(userId);
    }

    public void preValidateUserName(String name) throws Exception {
        isNameExist(name);
    }

    public void isIdExist(String userId) throws Exception {
        if (userRepo.getOneUserId(userId) ==null) {
            throw new Exception("User with id" + userId + "already exists");
        }
    }

    public void isNameExist(String name) throws Exception {
        if (userRepo.getOneUserName(name) ==null) {
            throw new Exception("User with Name" + name + "already exist");
        }
    }


}
