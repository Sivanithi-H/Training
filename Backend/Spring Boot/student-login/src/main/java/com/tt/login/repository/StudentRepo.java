package com.tt.login.repository;

import com.tt.login.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    @Autowired
    MongoTemplate mongoTemplate;

    public Student create(Student student) {
        return mongoTemplate.save(student);
    }

    public Student getStuById(String stuId) {
        return mongoTemplate.findOne(Query.query(Criteria.where("stuId").is(stuId)),Student.class);
    }

    public void removeStu(String stuId) {
        mongoTemplate.remove(Query.query(Criteria.where("stuId").is(stuId)),Student.class);
    }

    public void updateStu(Student student, String stuId) {
    }
}
