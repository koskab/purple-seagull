package com.example.alabstest.items.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemUpdate {
    private LocalDate deadlineDate;
    private String name;
    private Integer count;
    private BigDecimal price;
}
