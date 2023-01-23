package com.Springboot.Insta.Service;

import com.Springboot.Insta.Repo.PostRepository;
import com.Springboot.Insta.Service.Validation.IdAndNameValidator;
import com.Springboot.Insta.Service.Validation.PostValidator;
import com.Springboot.Insta.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
    @Autowired
    PostValidator postValidator;
    @Autowired
    IdAndNameValidator idAndNameValidator;

    public void createPost(String userId, String imageUrl) throws Exception {
        idAndNameValidator.isIdExist(userId);
        postRepository.createPost(userId, imageUrl);
    }

    public Post getPostById(String postId) throws Exception {
        postValidator.isPostExist(postId);
        postRepository.getPostById(postId);
    }

    public void deletePost(String postId) throws Exception {
        postValidator.preValidatePost(postId);
        postRepository.deletePost(postId);
    }

    public void deleteAllPostByUser(String userId) throws Exception {
        idAndNameValidator.isIdExist(userId);
        postRepository.deleteAllPostOfUSer(userId);
    }

    public List<Post> getAllPost(String pageNumber, String pageSize) {
        return postRepository.getAllPost(pageNumber, pageSize);
    }

    public List<Post> getAllPostOfUsers(String userId, String pageNumber, String pageSize) {
        return postRepository.getAllPostOfUser(userId, pageNumber, pageSize);
    }

    public void deleteAllPostOfUser(String userId) {
        return postRepository.deleteAllPostOfUser(userId);
    }
}
