package com.security.security.repository;


import com.security.security.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserInfoRepository extends MongoRepository<UserInfo, String> {

    Optional<UserInfo> findByName(String username);
}
