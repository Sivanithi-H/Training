package com.Springboot.Insta.Repo;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryImplement {

  public default Query getQueryForUserId(String userId) {
      return Query.query(Criteria.where("userId").is(userId));
  }

  public default Query getQueryForUserName(String name) {
      return Query.query(Criteria.where("name").is(name));
  }

  public default Query getQueryForPostId(String postId) {
      return Query.query(Criteria.where("postId").is(postId));
  }

}
