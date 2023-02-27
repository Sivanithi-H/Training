package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    MongoTemplate template;

    public User findByName(String name) {
        User user = template.findOne(Query.query(Criteria.where("name").is(name)), User.class);
        return user;
    }

    public User createUser(User user) {
        user.setRole(user.getRole());
        template.save(user);
        return user;
    }

    public List<User> getAllUsers() {
        return template.findAll(User.class);
    }
}
