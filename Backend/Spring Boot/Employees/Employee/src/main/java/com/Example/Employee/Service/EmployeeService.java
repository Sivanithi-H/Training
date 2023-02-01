package com.Example.Employee.Service;

import com.Example.Employee.Pojo.Employee;
import com.Example.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    public Employee getOneEmpId (String empId) {
        return empRepo.getOneEmpId(empId);
    }

    public Employee getOneEmpName (String name) {
        return empRepo.getOneEmpName(name);
    }
    public void addEmployee(Employee employee) {
        empRepo.addEmp(employee);
    }

    public void updateAnEmp(Employee employee) {
        empRepo.updateAnEmp(employee);
    }
}
