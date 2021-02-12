package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.fiscalia.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	
	

}
