package com.mapper.demomapper.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Commerce {

    @Id
    private int id;
    private String name;
    private String role;
    private String price;
    private String promotionCode;
    private String refId;
    private int quantity;

}
