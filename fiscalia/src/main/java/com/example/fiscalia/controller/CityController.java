package com.example.fiscalia.controller;
import com.example.fiscalia.repository.ProvinceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.fiscalia.model.City;
import com.example.fiscalia.model.Country;
import com.example.fiscalia.model.Province;
import com.example.fiscalia.repository.CityRepository;
import com.example.fiscalia.repository.ProvinceRepository;

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
	@PostMapping("/city/save/{id}")
	public  City CreaeteCity(@RequestBody City x,@RequestParam( name ="id")int id){
		Province p = new Province();
		p.setProvinceId(id);
		x.setProvince(p);
		return x;
		
	}
	
	@DeleteMapping("/city/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 cities.deleteById(id);
		 return 1;
		
	}
	

}
