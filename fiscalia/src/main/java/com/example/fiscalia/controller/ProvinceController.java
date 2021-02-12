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

import com.example.fiscalia.model.Province;
import com.example.fiscalia.repository.ProvinceRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ProvinceController {
	@Autowired
	private ProvinceRepository provinces;
	
	@GetMapping("/provinces")
	public List<Province> getprovinces(){
		return provinces.findAll();
		
	}
	@GetMapping("/provinces/{id}")
	public Optional<Province> getprovinces(@PathVariable(name="id") Integer id){
		return provinces.findById(id);
		
	}
	@PostMapping("/provinces/save")
	public  Province CreaeteProvince(@RequestBody Province x){
		return provinces.save(x);
		
	}
	
	@DeleteMapping("/provinces/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 provinces.deleteById(id);
		 return 1;
		
	}
	

}
