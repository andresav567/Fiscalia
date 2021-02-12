package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.ProcessType;

@Repository
public interface ProcessTypeRepository extends JpaRepository<ProcessType, Integer> {
	
	

}
