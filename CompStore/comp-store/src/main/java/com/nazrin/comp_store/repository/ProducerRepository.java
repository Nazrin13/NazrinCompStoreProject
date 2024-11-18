package com.nazrin.comp_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazrin.comp_store.model.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
    
}
