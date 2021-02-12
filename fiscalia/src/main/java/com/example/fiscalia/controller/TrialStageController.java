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

import com.example.fiscalia.model.TrialStage;
import com.example.fiscalia.repository.TrialStageRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TrialStageController {
	@Autowired
	private TrialStageRepository trialstages;
	
	@GetMapping("/trialstages")
	public List<TrialStage> gettrialstages(){
		return trialstages.findAll();
		
	}
	@GetMapping("/trialstages/{id}")
	public Optional<TrialStage> gettrialstages(@PathVariable(name="id") Integer id){
		return trialstages.findById(id);
		
	}
	@PostMapping("/trialstages/save")
	public  TrialStage CreaeteTrialStage(@RequestBody TrialStage x){
		return trialstages.save(x);
		
	}
	
	@DeleteMapping("/trialstages/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 trialstages.deleteById(id);
		 return 1;
		
	}
	

}
