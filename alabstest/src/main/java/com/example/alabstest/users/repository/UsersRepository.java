package com.example.alabstest.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository<User, Long> extends JpaRepository<User, Long> {
}
