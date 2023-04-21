package com.mapper.demomapper.service;

import com.mapper.demomapper.entity.Commerce;
import com.mapper.demomapper.repository.CommerceRepository;
import com.mapper.demomapper.repository.UserInfoRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Slf4j
public class CommerceService {


    @Autowired
    CommerceRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public void save(Commerce commerce) {
        log.info("Saving new product");
        repository.save(commerce);
    }

    public List<Commerce> findAll() {
       return repository.findAll();
    }

    public Commerce findOne(int id) {
        log.info("Searching product id{}",id);
        return repository.findById(id).orElse(null);
    }
}
