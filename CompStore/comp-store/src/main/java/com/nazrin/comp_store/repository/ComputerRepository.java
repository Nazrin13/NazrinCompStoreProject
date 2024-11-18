package com.nazrin.comp_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazrin.comp_store.model.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {

    
} 