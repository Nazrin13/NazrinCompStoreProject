package com.nazrin.comp_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazrin.comp_store.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
