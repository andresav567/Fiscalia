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

import com.example.fiscalia.model.Contact;
import com.example.fiscalia.repository.ContactRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ContactController {
	@Autowired
	private ContactRepository contacts;
	
	@GetMapping("/contact")
	public List<Contact> getcontacts(){
		return contacts.findAll();
		
	}
	@GetMapping("/contact/{id}")
	public Optional<Contact> getcontacts(@PathVariable(name="id") Integer id){
		return contacts.findById(id);
		
	}
	@PostMapping("/contact/save")
	public  Contact CreaeteContact(@RequestBody Contact x){
		return contacts.save(x);
		
	}
	
	@DeleteMapping("/contact/delete/{id}")
	public  Integer delete(@PathVariable(name="id") Integer id){
		System.out.print(id);
		 contacts.deleteById(id);
		 return 1;
		
	}
	

}
