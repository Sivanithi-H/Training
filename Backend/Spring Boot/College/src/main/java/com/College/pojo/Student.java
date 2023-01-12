package com.College.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentCollection")
public class Student {

    @Id
    private String stuId;
    private String name;
    private String email;
    private String phoneNumber;

    public Student(String id, String name, String email, String phoneNumber) {
        this.stuId = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
