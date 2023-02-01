package com.Example.Employee.Repository;

import com.Example.Employee.Pojo.Employee;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class EmployeeRepository {

    private MongoTemplate mongoTemplate;

    public Employee getOneEmpId (String empId) {
        return mongoTemplate.findOne(Query.query(Criteria.where("empId").is(empId)), Employee.class);
    }

    public Employee getOneEmpName (String name) {
        return mongoTemplate.findOne(Query.query(Criteria.where("empId").is(name)), Employee.class);
    }

    public void addEmp(Employee employee) {
        mongoTemplate.save(employee);
    }

    public ResponseEntity<Employee> updateAnEmp(@RequestBody Employee employeeDetails) {
        Employee updateEmployee = mongoTemplate.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + empId));

        mongoTemplate.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }
}
