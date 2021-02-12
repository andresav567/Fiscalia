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

import com.example.fiscalia.model.User;
import com.example.fiscalia.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TrialModelController {
	@Autowired
	private UserRepository users;
	
	@GetMapping("/trialmodels")
	public List<User> getUsers(){
		return users.findAll();
		
	}
	@GetMapping("/trialmodels/{id}")
	public Optional<User> getUsers(@PathVariable(name="id") Integer id){
		return users.findById(id);
		
	}
	@PostMapping("/trialmodels/save")
	public  User CreaeteUser(@RequestBody User usuario){
		return users.save(usuario);
		
	}
	
	@DeleteMapping("/trialmodels/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 users.deleteById(id);
		 return 1;
		
	}
	

}
