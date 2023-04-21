package com.mapper.demomapper.entity;

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
    private String password;
    private String email;
    private String roles;

}
