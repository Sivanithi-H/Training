package com.tt.login.controller;

import com.tt.login.entity.Student;
import com.tt.login.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService stuService;

    @GetMapping("/test")
    public String test() {
        return "Application is started";
    }

    @GetMapping("/id/{stuId}")
    public Student getStuById(@PathVariable String stuId) {
        return stuService.getStuById(stuId);
    }

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        stuService.create(student);
        return "Student Created";
    }

    @PutMapping("/update/{stuId}")
    public String updateStudent(@RequestBody Student student, @PathVariable String stuId) {
        return "Student updated";
    }

    @DeleteMapping("/delete/{stuId}")
    public String deleteStudent(@PathVariable String stuId) {
        stuService.deleteStu(stuId);
        return "Student removed";
    }
}
