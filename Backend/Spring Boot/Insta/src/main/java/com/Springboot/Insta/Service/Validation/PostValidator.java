package com.Springboot.Insta.Service.Validation;

import com.Springboot.Insta.Repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostValidator {
    @Autowired
    PostRepository postRepository;

    public void preValidatePost(String postId) throws Exception {
        if(isPostExist(postId)) {
            throw new Exception("Re Enter postId correctly - postId not FOUND");
        }
    }

    public boolean isPostExist(String postId) {
        return postRepository.getPostById(postId) == null;
    }
}
