package com.example.alabstest.carts.repository;

import com.example.alabstest.carts.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
