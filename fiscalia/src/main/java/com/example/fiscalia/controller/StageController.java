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

import com.example.fiscalia.model.Stage;
import com.example.fiscalia.repository.StageRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class StageController {
	@Autowired
	private StageRepository stages;
	
	@GetMapping("/stages")
	public List<Stage> getstages(){
		return stages.findAll();
		
	}
	@GetMapping("/stages/{id}")
	public Optional<Stage> getstages(@PathVariable(name="id") Integer id){
		return stages.findById(id);
		
	}
	@PostMapping("/stages/save")
	public  Stage CreaeteStage(@RequestBody Stage x){
		return stages.save(x);
		
	}
	
	@DeleteMapping("/stages/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 stages.deleteById(id);
		 return 1;
		
	}
	

}
