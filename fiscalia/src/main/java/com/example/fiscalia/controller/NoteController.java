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

import com.example.fiscalia.model.Note;
import com.example.fiscalia.repository.NoteRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class NoteController {
	@Autowired
	private NoteRepository notes;
	
	@GetMapping("/note")
	public List<Note> getnotes(){
		return notes.findAll();
		
	}
	@GetMapping("/note/{id}")
	public Optional<Note> getnotes(@PathVariable(name="id") Integer id){
		return notes.findById(id);
		
	}
	@PostMapping("/note/save")
	public  Note CreaeteNote(@RequestBody Note x){
		return notes.save(x);
		
	}
	
	@DeleteMapping("/note/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 notes.deleteById(id);
		 return 1;
		
	}
	

}
