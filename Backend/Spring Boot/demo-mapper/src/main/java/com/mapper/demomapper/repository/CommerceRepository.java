package com.mapper.demomapper.repository;

import com.mapper.demomapper.entity.Commerce;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommerceRepository extends MongoRepository<Commerce, Integer> {
}
