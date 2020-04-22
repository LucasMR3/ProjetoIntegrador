package com.Glass4Child.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Glass4Child.project.entities.address;

public interface addressRepository extends JpaRepository<address, Long>{
	Optional<address> findByDocument(String document);
}
