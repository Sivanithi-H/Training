package com.Example.Employee.Pojo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Employee")
public class Employee {

    @Id
    private long empId;
    private String Name;
    private String Email;
    private String Address;


}
