package com.mapper.demomapper.service;

import com.mapper.demomapper.entity.Commerce;
import com.mapper.demomapper.repository.CommerceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CommerceService {


    @Autowired
    CommerceRepository repository;

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
