package com.Glass4Child.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Glass4Child.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
