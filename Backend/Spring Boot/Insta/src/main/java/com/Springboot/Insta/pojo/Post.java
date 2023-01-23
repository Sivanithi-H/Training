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

    private String profileId;
    @Id
    private String postId;
    private String imageUrl;
    private Date updateDateAndTime;

    public Post(String profileId, String postId, String imageUrl, long updateDateAndTime) {
        this.profileId = profileId;
        this.postId = postId;
        this.imageUrl = imageUrl;
        this.updateDateAndTime = new Date();
    }


}
