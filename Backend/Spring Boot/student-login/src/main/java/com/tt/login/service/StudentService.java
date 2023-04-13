package com.tt.login.service;

import com.tt.login.entity.Student;
import com.tt.login.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo stuRepo;

    public Student create(Student student) {
        return stuRepo.create(student);
    }

    public Student getStuById(String stuId) {
        return stuRepo.getStuById(stuId);
    }

    public void deleteStu(String stuId) {
        stuRepo.removeStu(stuId);
    }

    public void updateStu(Student student, String stuId) {

    }
}
