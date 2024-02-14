package com.example.AlabsTest;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
public class User {
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDate birthdate;

    private Byte isDeleted;

    private BigDecimal price;

    private String fullName;
    private String email;
    private String password;

    public User(LocalDate birthdate, BigDecimal price, String fullName, String email, String password) {
        this.birthdate = birthdate;
        this.price = price;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }


}
