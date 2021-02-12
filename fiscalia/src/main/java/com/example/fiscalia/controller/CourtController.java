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

import com.example.fiscalia.model.Court;
import com.example.fiscalia.repository.CourtRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CourtController {
	@Autowired
	private CourtRepository courts;
	
	@GetMapping("/court")
	public List<Court> getcourts(){
		return courts.findAll();
		
	}
	@GetMapping("/court/{id}")
	public Optional<Court> getcourts(@PathVariable(name="id") Integer id){
		return courts.findById(id);
		
	}
	@PostMapping("/court/save")
	public  Court CreaeteCourt(@RequestBody Court x){
		return courts.save(x);
		
	}
	
	@DeleteMapping("/court/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 courts.deleteById(id);
		 return 1;
		
	}
	

}
