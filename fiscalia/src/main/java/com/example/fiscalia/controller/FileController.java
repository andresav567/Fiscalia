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

import com.example.fiscalia.model.File;
import com.example.fiscalia.repository.FileRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class FileController {
	@Autowired
	private FileRepository files;
	
	@GetMapping("/file")
	public List<File> getfiles(){
		return files.findAll();
		
	}
	@GetMapping("/file/{id}")
	public Optional<File> getfiles(@PathVariable(name="id") Integer id){
		return files.findById(id);
		
	}
	@PostMapping("/file/save")
	public  File CreaeteFile(@RequestBody File x){
		return files.save(x);
		
	}
	
	@DeleteMapping("/file/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 files.deleteById(id);
		 return 1;
		
	}
	

}
