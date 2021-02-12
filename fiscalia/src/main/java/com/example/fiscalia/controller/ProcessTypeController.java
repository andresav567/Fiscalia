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

import com.example.fiscalia.model.ProcessType;
import com.example.fiscalia.repository.ProcessTypeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ProcessTypeController {
	@Autowired
	private ProcessTypeRepository processtypes;
	
	@GetMapping("/processtype")
	public List<ProcessType> getprocesstypes(){
		return processtypes.findAll();
		
	}
	@GetMapping("/processtype/{id}")
	public Optional<ProcessType> getprocesstypes(@PathVariable(name="id") Integer id){
		return processtypes.findById(id);
		
	}
	@PostMapping("/processtype/save")
	public  ProcessType CreaeteProcessType(@RequestBody ProcessType x){
		return processtypes.save(x);
		
	}
	
	@DeleteMapping("/processtype/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 processtypes.deleteById(id);
		 return 1;
		
	}
	

}
