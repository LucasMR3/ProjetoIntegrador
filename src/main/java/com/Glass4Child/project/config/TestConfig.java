package com.Glass4Child.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Glass4Child.project.entities.User;
import com.Glass4Child.project.entities.beneficent;
import com.Glass4Child.project.repositories.UserRepository;
import com.Glass4Child.project.repositories.beneficentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	private beneficentRepository beneficentRepository; 
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		beneficent u2 = new beneficent(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList( u1));

		beneficentRepository.saveAll(Arrays.asList( u2));
	}
	
}