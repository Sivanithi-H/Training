package com.mapper.demomapper.controller;

import com.mapper.demomapper.dto.CommerceDto;
import com.mapper.demomapper.entity.Commerce;
import com.mapper.demomapper.mapper.CommerceMapper;
import com.mapper.demomapper.service.CommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commerce")
public class CommerceController {

    @Autowired
    CommerceService service;

    @Autowired
    CommerceMapper mapper;

    static public String token = "SN631";

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
