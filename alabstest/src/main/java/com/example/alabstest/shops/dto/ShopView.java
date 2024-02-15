package com.example.alabstest.shops.dto;

import com.example.alabstest.items.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShopView {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Long> itemIds;
}
