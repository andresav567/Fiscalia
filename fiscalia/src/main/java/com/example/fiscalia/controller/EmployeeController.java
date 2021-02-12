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

import com.example.fiscalia.model.Employee;
import com.example.fiscalia.repository.EmployeeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository Emploies;
	
	@GetMapping("/employee")
	public List<Employee> getEmploies(){
		return Emploies.findAll();
		
	}
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmploies(@PathVariable(name="id") Integer id){
		return Emploies.findById(id);
		
	}
	@PostMapping("/employee/save")
	public  Employee CreaeteEmployee(@RequestBody Employee x){
		return Emploies.save(x);
		
	}
	
	@DeleteMapping("/employee/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 Emploies.deleteById(id);
		 return 1;
		
	}
	

}
