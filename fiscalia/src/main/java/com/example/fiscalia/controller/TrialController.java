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

import com.example.fiscalia.model.Trial;
import com.example.fiscalia.repository.TrialRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TrialController {
	@Autowired
	private TrialRepository trials;
	
	@GetMapping("/trials")
	public List<Trial> gettrials(){
		return trials.findAll();
		
	}
	@GetMapping("/trials/{id}")
	public Optional<Trial> gettrials(@PathVariable(name="id") Integer id){
		return trials.findById(id);
		
	}
	@PostMapping("/trials/save")
	public  Trial CreaeteTrial(@RequestBody Trial x){
		return trials.save(x);
		
	}
	
	@DeleteMapping("/trials/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 trials.deleteById(id);
		 return 1;
		
	}
	

}
