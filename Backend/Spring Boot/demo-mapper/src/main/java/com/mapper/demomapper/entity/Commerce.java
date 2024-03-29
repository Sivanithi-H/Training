package com.mapper.demomapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commerce {

    @Id
    private int id;
    private String name;
    private String price;
    private String promotionCode;
    private String refId;
    private int quantity;
}
