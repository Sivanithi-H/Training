package com.security.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    private String roles;

}
//{
//    "id" : 001,
//    "name" : "Siva",
//    "email" : "siva123@gmail.com",
//    "password" : "siva123",
//    "roles" : "ROLE_USER"
//}