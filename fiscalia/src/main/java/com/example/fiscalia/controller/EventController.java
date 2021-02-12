package com.example.fiscalia.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.fiscalia.model.Evento;
import com.example.fiscalia.repository.EventoRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EventController {
	@Autowired
	private EventoRepository events;
	
	@GetMapping("/event")
	public List<Evento> getevents(){
		return events.findAll();
		
	}
	@GetMapping("/event/{id}")
	public Optional<Evento> getevents(@PathVariable(name="id") Integer id){
		return events.findById(id);
		
	}
	@PostMapping("/event/save")
	public  Evento CreaeteEvento(@RequestBody Evento x){
		return events.save(x);
		
	}
	
	@DeleteMapping("/event/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 events.deleteById(id);
		 return 1;
		
	}
	

}
