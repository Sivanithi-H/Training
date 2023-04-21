package com.mapper.demomapper.repository;

import com.mapper.demomapper.entity.Commerce;
import com.mapper.demomapper.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserInfoRepository extends MongoRepository<UserInfo, Integer> {

    Optional<UserInfo> findByName(String username);
}
