package com.Glass4Child.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Glass4Child.project.entities.User;
import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.repositories.UserRepository;
import com.Glass4Child.project.repositories.beneficentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    //private UserRepository userRepository;
    private beneficentRepository beneficentRepository;

    public void run(String... args) throws Exception {
        //User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Beneficent u2 = new Beneficent(null, "Maria Santos", "maria@gmail.com", "988888888", "123456", 300);
        Beneficent u3 = new Beneficent(null, "Thales Oliveira", "Thales@gmail.com", "911111111", "12345678", 350);

        //	userRepository.saveAll(Arrays.asList( u1));

        beneficentRepository.saveAll(Arrays.asList(u2,u3));
    }

}