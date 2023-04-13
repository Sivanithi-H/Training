package com.College.Controller;

import com.College.pojo.Student;
import com.College.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService stuService;

    @GetMapping
    public List<Student> getStudent() {
        return stuService.getAllStudent();
    }

    @GetMapping()
    public Student getOneStudentById(@PathVariable String id) {
        return stuService.getOneStudent(id);
    }

    @GetMapping
    public List<Student> getStudentWithPagination(@RequestParam String pageNumber, @RequestParam String pageSize) {
        return stuService.getAllStudentPaginated(pageNumber, pageSize);
    }

    @PostMapping
    public String create(@RequestParam Student newStudent) {
        stuService.create(newStudent);
        return "Student created";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        stuService.delete(id);
        return "Student deleted";
    }
    @PutMapping("/update")
    public String update(@RequestBody Student student) {
        stuService.update(student);
        return "Student updated";
    }
}
