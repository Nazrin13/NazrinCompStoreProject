package com.nazrin.comp_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazrin.comp_store.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
