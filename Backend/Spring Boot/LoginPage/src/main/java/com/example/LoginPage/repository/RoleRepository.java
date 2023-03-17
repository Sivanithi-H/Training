package com.example.LoginPage.repository;

import com.example.LoginPage.pojo.ERole;
import com.example.LoginPage.pojo.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

//    Optional<Role> findByName(ERole name);

}
