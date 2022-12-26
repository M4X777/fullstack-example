package com.example.fullstackexample.repository;

import com.example.fullstackexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
