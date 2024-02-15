package com.example.alabstest.items.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository<Item, Long> extends JpaRepository<Item, Long> {
}
