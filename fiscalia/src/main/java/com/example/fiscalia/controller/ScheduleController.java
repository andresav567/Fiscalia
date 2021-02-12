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

import com.example.fiscalia.model.Schedule;
import com.example.fiscalia.repository.ScheduleRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ScheduleController {
	@Autowired
	private ScheduleRepository schedules;
	
	@GetMapping("/schedules")
	public List<Schedule> getschedules(){
		return schedules.findAll();
		
	}
	@GetMapping("/schedules/{id}")
	public Optional<Schedule> getschedules(@PathVariable(name="id") Integer id){
		return schedules.findById(id);
		
	}
	@PostMapping("/schedules/save")
	public  Schedule CreaeteSchedule(@RequestBody Schedule x){
		return schedules.save(x);
		
	}
	
	@DeleteMapping("/schedules/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 schedules.deleteById(id);
		 return 1;
		
	}
	

}
