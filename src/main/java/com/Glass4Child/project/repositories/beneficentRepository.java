package com.Glass4Child.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Glass4Child.project.repositories.UserRepository;
import com.Glass4Child.project.entities.User;
import com.Glass4Child.project.entities.beneficent;

public interface beneficentRepository extends JpaRepository<beneficent, Long>{
	
}
