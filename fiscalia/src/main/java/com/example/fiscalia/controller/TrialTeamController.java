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

import com.example.fiscalia.model.TrialTeam;
import com.example.fiscalia.repository.TrialTeamRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TrialTeamController {
	@Autowired
	private TrialTeamRepository trialteams;
	
	@GetMapping("/trialteam")
	public List<TrialTeam> gettrialteams(){
		return trialteams.findAll();
		
	}
	@GetMapping("/trialteam/{id}")
	public Optional<TrialTeam> gettrialteams(@PathVariable(name="id") Integer id){
		return trialteams.findById(id);
		
	}
	@PostMapping("/trialteam/save")
	public  TrialTeam CreaeteTrialTeam(@RequestBody TrialTeam x){
		return trialteams.save(x);
		
	}
	
	@DeleteMapping("/trialteam/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 trialteams.deleteById(id);
		 return 1;
		
	}
	

}
