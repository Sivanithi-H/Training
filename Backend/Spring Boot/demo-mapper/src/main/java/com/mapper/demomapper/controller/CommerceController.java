package com.mapper.demomapper.controller;

import com.mapper.demomapper.dto.CommerceDto;
import com.mapper.demomapper.entity.Commerce;
import com.mapper.demomapper.mapper.CommerceMapper;
import com.mapper.demomapper.service.CommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commerce")
public class CommerceController {

    @Autowired
    CommerceService service;

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    CommerceMapper mapper;

    public String token = "SN631";

    @GetMapping("/login")
    public String getToken() {
        System.out.println(token);
        return token;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody CommerceDto dto) {
        Commerce commerce = mapper.dtoToModel(dto);
        service.save(commerce);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<CommerceDto> findAll() {
        return mapper.modelToDtos(service.findAll());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CommerceDto findOne(@PathVariable("id") int id) {
        return mapper.modelToDto(service.findOne(id));
    }
}
