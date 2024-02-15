package com.example.alabstest.carts.dto;

import com.example.alabstest.items.dto.ItemView;
import com.example.alabstest.shops.dto.ShopView;
import com.example.alabstest.users.dto.UserView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartView {
    private Long id;
    private UserView user;
    private ShopView shop;
    private ItemView item;
    private Integer quantity;
    private BigDecimal cost;
}
