package com.mapper.demomapper.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class CommerceDto {

    @Id
    private int id;
    private String name;
    private String price;
    private String code;
    private String refId;
    private int quantity;

}
