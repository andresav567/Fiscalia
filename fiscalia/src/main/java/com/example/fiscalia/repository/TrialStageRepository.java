package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.TrialStage;

@Repository
public interface TrialStageRepository extends JpaRepository<TrialStage, Integer> {
	
	

}
