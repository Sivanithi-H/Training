package com.stringToken.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private String id;
    private String proName;
    private Long qty;
    private Long price;

}


//{
//    "proName" : "Luxury",
//    "qty" : 45,
//    "price" : 80
//}
