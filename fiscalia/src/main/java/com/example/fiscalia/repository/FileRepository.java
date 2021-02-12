package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.File;


@Repository
public interface FileRepository extends JpaRepository<File, Integer> {
	
	

}
