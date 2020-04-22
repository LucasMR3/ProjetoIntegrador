package com.Glass4Child.project.resources;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.Glass4Child.project.entities.address;
import com.Glass4Child.project.services.addressService;

import javax.websocket.server.PathParam;
	import java.util.List;



	@RestController
	@RequestMapping(value = "/address")
	public class addressResource {

	    @Autowired
	    private addressService service;

	    @GetMapping
	    public ResponseEntity<List<address>> findAll() {

	        List<address> list = service.findAll();
	        return ResponseEntity.ok().body(list);
	    }

	    @GetMapping(value = "/{document}")
	    public ResponseEntity<address> findByDocument(@PathVariable String document) {
	        address obj = service.findByDocument(document);
	        return ResponseEntity.ok().body(obj);
	    }
}
