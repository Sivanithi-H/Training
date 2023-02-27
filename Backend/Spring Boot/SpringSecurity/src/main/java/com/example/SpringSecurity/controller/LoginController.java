package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.JwtTokenUtility.JwtService;
import com.example.SpringSecurity.dto.JwtResponse;
import com.example.SpringSecurity.pojo.Login;
import com.example.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager manager;

    public LoginController() {
    }

    @PostMapping("/login")
    public JwtResponse login(@RequestBody Login login) {
        Authentication authentication = manager.authenticate(new UsernamePasswordAuthenticationToken(login.getName(), login.getPassword()));
        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(login.getName());
            return new JwtResponse(token);
        }else {
            throw new UsernameNotFoundException("Invalid user request ! !");
        }
    }

    @GetMapping("/welcome")
    public String hello() {
        return "WELCOME !";
    }
}
