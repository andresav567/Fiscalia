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
import com.example.fiscalia.model.Activity;
import com.example.fiscalia.repository.ActivityRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ActivityController {
	@Autowired
	private ActivityRepository Activities;
	
	@GetMapping("/activities")
	public List<Activity> getActivity(){
		return Activities.findAll();
		
	}
	@GetMapping("/activities/{id}")
	public Optional<Activity> getActivity(@PathVariable(name="id") Integer id){
		return Activities.findById(id);
		
	}
	@PostMapping("/activities/save")
	public  Activity CreaeteUser(@RequestBody Activity usuario){
		return Activities.save(usuario);
		
	}
	
	@DeleteMapping("/activities/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		Activities.deleteById(id);
		 return 1;
		
	}
	

}
