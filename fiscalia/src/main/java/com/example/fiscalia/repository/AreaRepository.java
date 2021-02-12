package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Area;


@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
	
	

}
