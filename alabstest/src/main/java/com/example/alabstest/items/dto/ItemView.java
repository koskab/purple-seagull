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
public class ItemView {
    private Long id;
    private String name;
    private LocalDate deadlineDate;
    private int count;
    private BigDecimal price;
}
