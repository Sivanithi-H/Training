package com.College.Repository;

import com.College.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepository {

    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Student> getAllStudent() {
        return mongoTemplate.findAll(Student.class);
    }

    public Student getOneStudent(String id) {
        return mongoTemplate.findOne(Query.query(Criteria.where("stuId")), Student.class);
    }

    public void create(Student student) {
        mongoTemplate.save(student);
    }

    public void delete(String id) {
        mongoTemplate.remove(Query.query(Criteria.where("stuId").is(id)), Student.class);
    }

    public void update(Student student) {
        Query query = new Query().addCriteria(Criteria.where("stuId").is(student.getStuId()));
        Update update =new Update();
        update.set("name", student.getName());
        update.set("description", student.getPhoneNumber());
        mongoTemplate.findAndModify(query, update, Student.class);
    }

    public List<Student> getAllStudentPaginated(String pageNumber, String pageSize) {
        Query query = new Query().skip(Integer.parseInt(pageNumber) * Integer.parseInt(pageSize)).limit(Integer.parseInt(pageSize));
        return mongoTemplate.find(query, Student.class);
    }
}
