package com.mapper.demomapper.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Commerce {

    @Id
    private int id;
    private String name;
    private String price;
    private String promotionCode;
    private String refId;
    private int quantity;

}
