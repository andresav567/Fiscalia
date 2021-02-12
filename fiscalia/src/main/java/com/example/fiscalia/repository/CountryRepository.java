package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	

}
