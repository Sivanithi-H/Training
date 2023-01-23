package com.Springboot.Insta.Service.Validation;

import com.Springboot.Insta.Repo.UserRepo;
import com.Springboot.Insta.pojo.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserValidator {

    @Autowired
    UserRepo userRepo;
    public void preValidateUser(UserProfile user) throws Exception {
        if (isIdAvailable(user.getUserId())) {
            throw new Exception("User with profile id" + user.getUserId() + "already exists");
        } else if (isNameAvailable(user.getName())) {
            throw new Exception("User with profile name" + user.getName() + "already exists");
        }
    }
    public Boolean isIdAvailable(String id) {
        return (userRepo.getOneUserId(id) != null);
    }

    public Boolean isNameAvailable(String name) {
        return (userRepo.getOneUserName(name) != null);
    }
}
