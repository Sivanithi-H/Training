package com.tt.login.repository;

import com.tt.login.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<Student> viewAllStudent(String pageNumber, String pageSize) {
        Query query = new Query().skip(Integer.parseInt(pageNumber) * Integer.parseInt(pageSize)).limit(Integer.parseInt(pageSize));
        return mongoTemplate.find(query, Student.class);
    }

    public void update(Student student, String stuId) {
        Query query = new Query().addCriteria(Criteria.where("stuId").is(stuId));
        Update update =new Update();

        update.set("name", student.getName());
        update.set("phoneNumber", student.getPhoneNumber());
        update.set("address", student.getAddress());
        mongoTemplate.updateMulti(query, update, Student.class);
    }
}
