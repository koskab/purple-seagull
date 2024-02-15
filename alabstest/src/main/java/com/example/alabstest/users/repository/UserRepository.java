package com.example.alabstest.users.repository;

import com.example.alabstest.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
