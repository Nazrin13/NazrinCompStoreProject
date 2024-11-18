package com.nazrin.comp_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazrin.comp_store.model.CPU;

public interface CPURepository extends JpaRepository<CPU, Integer> {
    
}
