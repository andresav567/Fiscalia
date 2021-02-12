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

import com.example.fiscalia.model.UserRole;
import com.example.fiscalia.repository.RoleRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RolesController {
	@Autowired
	private RoleRepository roles;

	
	@GetMapping("/roles")
	public List<UserRole> getroles(){
		return roles.findAll();
		
	}
	@GetMapping("/roles/{id}")
	public Optional<UserRole> getroles(@PathVariable(name="id") Integer id){
		return roles.findById(id);
		
	}
	@PostMapping("/saverol")
	public  UserRole CreaeteUser(@RequestBody UserRole x){
		return roles.save(x);
		
	}
	
	@DeleteMapping("/delete/rol/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		 roles.deleteById(id);
		 return 1;
		
	}

}