package com.example.AlabsTest;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Shop {
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Byte isDeleted;

    private String name;
    private String address;
    private String phoneNumber;

    public Shop(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
