package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
	
	

}
