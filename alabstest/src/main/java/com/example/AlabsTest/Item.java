package com.example.AlabsTest;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
public class Item {
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDate deadlineDate;

    private Byte isDeleted;

    private String name;

    private Integer count;

    public Item(LocalDate deadlineDate, String name, Integer count) {
        this.deadlineDate = deadlineDate;
        this.name = name;
        this.count = count;
    }
}
