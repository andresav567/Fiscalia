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

import com.example.fiscalia.model.Job;
import com.example.fiscalia.repository.JobRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class JobController {
	@Autowired
	private JobRepository jobs;
	
	@GetMapping("/job")
	public List<Job> getjobs(){
		return jobs.findAll();
		
	}
	@GetMapping("/job/{id}")
	public Optional<Job> getjobs(@PathVariable(name="id") Integer id){
		return jobs.findById(id);
		
	}
	@PostMapping("/job/save")
	public  Job CreaeteJob(@RequestBody Job x){
		return jobs.save(x);
		
	}
	
	@DeleteMapping("/job/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 jobs.deleteById(id);
		 return 1;
		
	}
	

}
