package com.Springboot.Insta.Repo;

import com.Springboot.Insta.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository implements QueryImplement{
    @Autowired
    MongoTemplate mongoTemplate;

    public void createPost(String userId, String imageUrl) {
        mongoTemplate.save(new Post(userId, imageUrl));
    }

    public Post getPostById(String postId) {
        return mongoTemplate.findOne(Query.query(Criteria.where(postId)),Post.class);
    }

    public void deletePost(String postId) {
        mongoTemplate.remove(Query.query(Criteria.where(postId)), Post.class);
    }

    public List<Post> getAllPost(String pageNumber, String pageSize) {
        return mongoTemplate.find(
                new Query().skip((long) Integer.parseInt(pageNumber) * Integer.parseInt(pageSize))
                        .limit(Integer.parseInt(pageSize)), Post.class);
    }

    public List<Post> getAllPostOfUser(String userId, String pageNumber, String pageSize) {
        return mongoTemplate.find(getQueryForPostId(userId)
                .skip( (long) Integer.parseInt(pageNumber) * Integer.parseInt(pageSize))
                .limit(Integer.parseInt(pageSize)), Post.class);
    }

    public void deleteAllPostOfUser(String userId) {
        mongoTemplate.remove(getQueryForUserId(userId), Post.class);
    }
}
