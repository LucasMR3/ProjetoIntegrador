package com.Glass4Child.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.entities.address;
import com.Glass4Child.project.repositories.addressRepository;
import com.Glass4Child.project.repositories.beneficentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    //private UserRepository userRepository;
    private beneficentRepository beneficentRepository;
private addressRepository addressRepository;
    public void run(String... args) throws Exception {
    	
        //User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        address au2 = new address("1515","rio","vila","maria",12);
    	Beneficent u2 = new Beneficent("Thales Oliveira", "thales@gmail.com","pass", (long) 911111111, "12345678", 350, "Stark",au2);
     //   Beneficent u3 = new Beneficent("023", "Thales Oliveira", "thales@gmail.com", (long) 911111111, "12345678", 350, "Stark");
    
        //	userRepository.saveAll(Arrays.asList( u1));

        beneficentRepository.saveAll(Arrays.asList(u2));
        addressRepository.saveAll(Arrays.asList(au2));
    }
}