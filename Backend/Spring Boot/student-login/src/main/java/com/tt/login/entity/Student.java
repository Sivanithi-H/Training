package com.tt.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "Student")
public class Student {

    @Id
    private String stuId;
    private String name;
    private int password;
    private String degree;
    private Address address;
    private String phoneNumber;

}

/*
door number -- long
street name  -- string
city -- string
state -- string
pin code -- long
 */

/*
{
    "stuId": "191EC112",
    "name": "Arulmozhi",
    "qualification": "B.E",
    "address": {
        "door number": 1234567890,
        "street name": "Teachers colony"
    }
}
 */
