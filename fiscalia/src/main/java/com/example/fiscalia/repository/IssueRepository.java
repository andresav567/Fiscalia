package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {
	
	

}
