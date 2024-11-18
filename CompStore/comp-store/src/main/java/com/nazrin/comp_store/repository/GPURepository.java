package com.nazrin.comp_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazrin.comp_store.model.GPU;

public interface GPURepository extends JpaRepository<GPU, Integer> {
    
}
