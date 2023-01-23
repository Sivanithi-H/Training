package com.Springboot.Insta.Controller;

import com.Springboot.Insta.Service.PostService;
import com.Springboot.Insta.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    @Autowired
    PostService postService;

    @PutMapping("{userId}/create/{image url}")
    public String createPost(@PathVariable String userId, @PathVariable String imageUrl) throws Exception {
        postService.createPost(userId, imageUrl);
        return "Post Created";
    }

    @GetMapping("{postId}")
    public Post getPostById(@PathVariable String postId) throws Exception {
        return postService.getPostById(postId);
    }

    @GetMapping("getAllPost")
    public List<Post> getAllPost(@RequestParam String pageNumber,@RequestParam String pageSize) throws Exception {
        return postService.getAllPost(pageNumber, pageSize);
    }

    @GetMapping("{userId}/getAllPost")
    public List<Post> getAllPostOfUser(@PathVariable String userId, @RequestParam String pageNumber, @RequestParam String pageSize) throws Exception {
        return postService.getAllPostOfUsers(userId, pageNumber,pageSize);
    }

    @DeleteMapping("delete/{postId}")
    public String deletePost(@PathVariable String postId) throws Exception {
        postService.deletePost(postId);
        return "Post Deleted";
    }

    @DeleteMapping("{userId}/deleteAll")
    public String deleteAllPostOfUser(@PathVariable String userId) throws Exception {
        postService.deleteAllPostOfUser(userId);
        return "All post in userId" + userId + "is deleted";
    }
}
