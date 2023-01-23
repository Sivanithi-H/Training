package com.Springboot.Insta.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document (collection = "Post")
public class Post {

    private String userId;
    @Id
    private String postId;
    private String imageUrl;
    private Date updateDateAndTime;

    public Post(String userId, String imageUrl) {
        this.userId = userId;
        this.imageUrl = imageUrl;
        this.updateDateAndTime = new Date();
    }



}
