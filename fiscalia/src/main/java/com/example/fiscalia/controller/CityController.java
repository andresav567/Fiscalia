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

import com.example.fiscalia.model.City;
import com.example.fiscalia.repository.CityRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CityController  {
	@Autowired
	private CityRepository cities;
	
	@GetMapping("/city") 
	public List<City> getcities(){
		return cities.findAll();
		
	}
	@GetMapping("/city/{id}")
	public Optional<City> getcities(@PathVariable(name="id") Integer id){
		return cities.findById(id);
		
	}
	@PostMapping("/city/save")
	public  City CreaeteCity(@RequestBody City x){
		return cities.save(x);
		
	}
	
	@DeleteMapping("/city/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 cities.deleteById(id);
		 return 1;
		
	}
	

}
