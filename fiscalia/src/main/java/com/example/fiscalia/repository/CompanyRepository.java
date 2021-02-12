package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	
	

}
