package com.Glass4Child.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Glass4Child.project.entities.User;
import com.Glass4Child.project.entities.beneficent;
import com.Glass4Child.project.repositories.UserRepository;
import com.Glass4Child.project.repositories.beneficentRepository;

@Service
public class beneficentService {

	@Autowired
	private beneficentRepository repository;

	public List<beneficent> findAll() {
		return (List<beneficent>) repository.findAll();
	}

	public beneficent findById(Long id) {
		Optional<beneficent> obj = (Optional<beneficent>) repository.findById(id);
		return obj.get();
	}
}