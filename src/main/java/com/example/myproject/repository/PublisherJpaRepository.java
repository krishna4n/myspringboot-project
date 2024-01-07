package com.example.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.model.Publisher;

@Repository
public interface PublisherJpaRepository extends JpaRepository<Publisher,Integer>{
    
}
