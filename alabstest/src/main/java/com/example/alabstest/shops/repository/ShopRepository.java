package com.example.alabstest.shops.repository;

import com.example.alabstest.shops.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}
