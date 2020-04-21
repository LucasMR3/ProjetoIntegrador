package com.Glass4Child.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Glass4Child.project.entities.User;
import com.Glass4Child.project.services.UserService;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){

		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{document}")
	public ResponseEntity<User> findById(@PathVariable Long document){
		User obj = service.findById(document);
		return ResponseEntity.ok().body(obj);
	}
}