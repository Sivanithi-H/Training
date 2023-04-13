package com.tt.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private long doorNo;
    private String street;
    private String city;
    private String district;
    private String state;
    private long pincode;

}
