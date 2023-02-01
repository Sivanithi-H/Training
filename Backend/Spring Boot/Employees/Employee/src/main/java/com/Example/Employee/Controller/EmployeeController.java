package com.Example.Employee.Controller;

import com.Example.Employee.Pojo.Employee;
import com.Example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/create")
    public void createEmployee (@RequestBody Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping("/id/{employeeId}")
    public Employee getOneEmpById (@PathVariable String empId) {
        return service.getOneEmpId(empId);
    }

    @GetMapping("/{name}")
    public Employee getOneEmpByName (@PathVariable String name) {
        return service.getOneEmpName(name);
    }

    @PutMapping
    public void updateEmp(@RequestBody Employee employee) {
        service.updateAnEmp(employee);
    }

}
