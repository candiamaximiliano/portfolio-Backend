package dev.candiamaximiliano.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.candiamaximiliano.portfolio.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

