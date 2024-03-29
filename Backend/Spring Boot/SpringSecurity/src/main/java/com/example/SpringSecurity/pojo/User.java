package com.example.SpringSecurity.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("User")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
}
//{
//    "name" : "siva",
//    "email" : "siva@gmail.com",
//    "password" : "1234",
//    "role" : "USER"
//        }