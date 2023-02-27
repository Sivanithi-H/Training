package com.example.SpringSecurity.service;

import com.example.SpringSecurity.configuration.UserUserDetails;
import com.example.SpringSecurity.pojo.User;
import com.example.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

@Component
public class UserUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

//    @Override
//    public UserDetails loadUserByName(String name) throws UsernameNotFoundException {
//        Optional<User> user = Optional.ofNullable(userRepo.findByName(name));
//        return user.map(UserUserDetails::new)
//                .orElseThrow(()-> new UsernameNotFoundException("user not found" + name));
//    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(userRepo.findByName(name));
        return user.map(UserUserDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException("user not found" + name));
    }
}
