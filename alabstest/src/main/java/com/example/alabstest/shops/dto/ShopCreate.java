package com.example.alabstest.shops.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShopCreate {
    private String name;
    private String address;
    private String phoneNumber;
}