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

import com.example.fiscalia.model.Area;
import com.example.fiscalia.repository.AreaRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AreaController {
	@Autowired
	private AreaRepository areas;
	
	@GetMapping("/area")
	public List<Area> getareas(){
		return areas.findAll();
		
	}
	@GetMapping("/area/{id}")
	public Optional<Area> getareas(@PathVariable(name="id") Integer id){
		return areas.findById(id);
		
	}
	@PostMapping("/area/save")
	public  Area CreaeteArea(@RequestBody Area x){
		return areas.save(x);
		
	}
	
	@DeleteMapping("/area/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 areas.deleteById(id);
		 return 1;
		
	}
	

}
