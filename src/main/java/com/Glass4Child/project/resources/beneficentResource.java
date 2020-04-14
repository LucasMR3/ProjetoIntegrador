package com.Glass4Child.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Glass4Child.project.entities.beneficent;
import com.Glass4Child.project.services.beneficentService;

import java.util.List;

@RestController
@RequestMapping(value = "/beneficents")
public class beneficentResource {
	
	@Autowired
	private beneficentService service;
	
	@GetMapping
	public ResponseEntity<List<beneficent>> findAll(){

		List<beneficent> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<beneficent> findById(@PathVariable Long id){
		beneficent obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}