package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
	
	

}
