package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Trial;

@Repository
public interface TrialRepository extends JpaRepository<Trial, Integer> {
	
	

}
