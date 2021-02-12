package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Stage;

@Repository
public interface StageRepository extends JpaRepository<Stage, Integer> {
	
	

}
