package com.College.Service;

import com.College.pojo.Student;
import com.College.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    public Student getOneStudent(String id) {
        return studentRepository.getOneStudent(id);
    }

    public List<Student> getAllStudentPaginated(String pageNumber, String pageSize) {
        return studentRepository.getAllStudentPaginated(pageNumber, pageSize);
    }
    
    public void create(Student student) {
        studentRepository.create(student);
    }
    
    public void delete(String id) {
        studentRepository.delete(id);
    }
    
    public void update(Student student) {
        studentRepository.update(student);
    }
}
