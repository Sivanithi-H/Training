package com.Springboot.Insta.pojo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Instagram")
public class UserProfile {

    @Id
    private String userId;
    private String name;
    private long noOfFollowers;
    private long noOfFollowing;

    public UserProfile(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.noOfFollowers = 0;
        this.noOfFollowing = 0;
    }
}
