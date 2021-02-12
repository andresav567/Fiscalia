package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.TrialModel;

@Repository
public interface TrialModelRepository extends JpaRepository<TrialModel, Integer> {
	
	

}
