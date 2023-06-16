package com.asea.back.repository;

import com.asea.back.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Boolean existsByFirstname(String username);
    Boolean existsByEmail(String email);

    @Override
    List<User> findAllById(Iterable<Integer> integers);
    @Override
    List<User> findAll();
}
