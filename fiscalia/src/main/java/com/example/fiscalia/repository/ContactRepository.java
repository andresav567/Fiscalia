package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	

}
