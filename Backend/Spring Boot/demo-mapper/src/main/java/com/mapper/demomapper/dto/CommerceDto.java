package com.mapper.demomapper.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CommerceDto {

    @Id
    private int id;
    private String name;
    private String price;
    private String code;
    private String refId;
    private int quantity;

}
