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

import com.example.fiscalia.model.Country;
import com.example.fiscalia.repository.CountryRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CountryController {
	@Autowired
	private CountryRepository countries;
	
	@GetMapping("/country")
	public List<Country> getcountries(){
		return countries.findAll();
		
	}
	@GetMapping("/country/{id}")
	public Optional<Country> getcountries(@PathVariable(name="id") Integer id){
		return countries.findById(id);
		
	}
	@PostMapping("/country/save")
	public  Country CreaeteCountry(@RequestBody Country x){
		return countries.save(x);
		
	}
	
	@DeleteMapping("/country/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 countries.deleteById(id);
		 return 1;
		
	}
	

}
