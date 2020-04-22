package com.Glass4Child.project.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Glass4Child.project.entities.address;
import com.Glass4Child.project.repositories.addressRepository;

@Service
public class addressService {
	
	    @Autowired
	    private addressRepository repository;

	    public List<address> findAll() {
	        return repository.findAll();
	    }

	    public address findByDocument(String document) {
	        Optional<address> obj = repository.findByDocument(document);
	        return obj.get();
	    }
	}

