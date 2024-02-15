package com.example.alabstest.users.dto;

import com.example.alabstest.items.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserView {
    private String fullName;
    private String email;
    private LocalDate birthdate;
    private List<Item> items;
}
