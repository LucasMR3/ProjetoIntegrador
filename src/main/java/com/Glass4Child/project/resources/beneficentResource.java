package com.Glass4Child.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.services.beneficentService;

import java.util.List;

@RestController
@RequestMapping(value = "/beneficent")
public class beneficentResource {
	
	@Autowired
	private beneficentService service;
	
	@GetMapping
	public ResponseEntity<List<Beneficent>> findAll(){

		List<Beneficent> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Beneficent> findById(@PathVariable Long id){
		Beneficent obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}