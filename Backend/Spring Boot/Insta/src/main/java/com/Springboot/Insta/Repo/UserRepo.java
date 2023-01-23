package com.Springboot.Insta.Repo;

import com.Springboot.Insta.pojo.UserProfile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

    private MongoTemplate mongoTemplate;

    public UserRepo(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public UserProfile getOneUserId(String userId) {
        return mongoTemplate.findOne(Query.query(Criteria.where("userId").is(userId)), UserProfile.class);
    }

    public UserProfile getOneUserName(String name) {
        return mongoTemplate.findOne(Query.query(Criteria.where("name").is(name)), UserProfile.class);
    }

    public void createUser(UserProfile newUser) {
        mongoTemplate.save(newUser);
    }

    public void deleteUser(String userId) {
        mongoTemplate.remove(Query.query(Criteria.where("userId").is(userId)), UserProfile.class);
    }
}
