package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.TrialTeam;

@Repository
public interface TrialTeamRepository extends JpaRepository<TrialTeam, Integer> {
	
	

}
