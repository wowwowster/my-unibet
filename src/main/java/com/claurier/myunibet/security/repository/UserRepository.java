package com.claurier.myunibet.security.repository;

import com.claurier.myunibet.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
