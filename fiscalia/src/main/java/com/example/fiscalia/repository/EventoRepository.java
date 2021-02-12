package com.example.fiscalia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.Evento;


@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
	
	

}
