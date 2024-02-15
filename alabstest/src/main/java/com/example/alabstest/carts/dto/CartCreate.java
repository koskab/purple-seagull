package com.example.alabstest.carts.dto;

import com.example.alabstest.items.dto.ItemView;
import com.example.alabstest.shops.dto.ShopView;
import com.example.alabstest.users.dto.UserView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartCreate {
    private Long shop;
    private Long item;
}
