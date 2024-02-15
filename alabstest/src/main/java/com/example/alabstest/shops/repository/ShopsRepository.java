package com.example.alabstest.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsRepository<Shop, Long> extends JpaRepository<Shop, Long> {
}
