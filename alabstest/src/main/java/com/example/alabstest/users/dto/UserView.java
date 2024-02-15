package com.example.alabstest.users.dto;

import com.example.alabstest.items.entity.Item;
import com.example.alabstest.shops.dto.ShopView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserView {
    private Long id;
    private String fullName;
    private String email;
    private LocalDate birthdate;
    private BigDecimal balance;
}
