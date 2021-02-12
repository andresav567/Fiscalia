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
public class UserController {
	@Autowired
	private UserRepository users;
	@GetMapping
	public String show() {
		
		return "anda";
	}
	
	@GetMapping("/listausers")
	public List<User> getUsers(){
		return users.findAll();
		
	}
	@GetMapping("/users/{id}")
	public Optional<User> getUsers(@PathVariable(name="id") Integer id){
		return users.findById(id);
		
	}
	@PostMapping("/save")
	public  User CreaeteUser(@RequestBody User usuario){
		return users.save(usuario);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		 users.deleteById(id);
		 return 1;
		
	}
/*	@GetMapping("/users/roles/{id}")
	public  List<User> buscar(@PathVariable(name="id") Integer id){
	//	return users.findByRoleByIduserRoleId(id);
				
	}*/
	@GetMapping("/users/nombre/{name}")
	public   Optional<User> buscar(@PathVariable(name="name") String name){
		return users.findByRoleEnabled('A');			
	}


}
