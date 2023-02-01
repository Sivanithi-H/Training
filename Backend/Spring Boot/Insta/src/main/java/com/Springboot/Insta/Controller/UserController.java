package com.Springboot.Insta.Controller;

import com.Springboot.Insta.Service.UserService;
import com.Springboot.Insta.pojo.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("userProfile")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserProfile newUser) throws Exception {
        userService.createUser(newUser);
        return "UserProfile created";
    }

    @GetMapping("/id/{userId}")
    public UserProfile getOneUserById(@PathVariable String userId) throws Exception {
        return userService.getOneUserId(userId);
    }

    @GetMapping("/{name}")
    public UserProfile getOneUserByName(@PathVariable String name) throws Exception{
        return userService.getOneUserName(name);
    }

    @DeleteMapping("delete/{userId}")
    public String delete(@PathVariable String userId) throws Exception {
        userService.deleteUser(userId);
        return "User deleted";
    }

}



