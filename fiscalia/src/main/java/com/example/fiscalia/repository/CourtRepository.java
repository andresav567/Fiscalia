package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.fiscalia.model.Court;


@Repository
public interface CourtRepository extends JpaRepository<Court, Integer> {

	

}
