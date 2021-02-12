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

import com.example.fiscalia.model.Issue;
import com.example.fiscalia.repository.IssueRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class IssueController {
	@Autowired
	private IssueRepository issues;
	
	@GetMapping("/issue")
	public List<Issue> getissues(){
		return issues.findAll();
		
	}
	@GetMapping("/issue/{id}")
	public Optional<Issue> getissues(@PathVariable(name="id") Integer id){
		return issues.findById(id);
		
	}
	@PostMapping("/issue/save")
	public  Issue CreaeteIssue(@RequestBody Issue x){
		return issues.save(x);
		
	}
	
	@DeleteMapping("/issue/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 issues.deleteById(id);
		 return 1;
		
	}
	

}
