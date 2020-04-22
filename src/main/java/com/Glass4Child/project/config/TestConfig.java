package com.Glass4Child.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.repositories.beneficentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    //private UserRepository userRepository;
    private beneficentRepository beneficentRepository;

    public void run(String... args) throws Exception {
        //User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Beneficent u2 = new Beneficent("001", "Maria Santos", "maria@gmail.com", (long) 988888888, "123456", 300, "Maria21");
        Beneficent u3 = new Beneficent("023", "Thales Oliveira", "thales@gmail.com", (long) 911111111, "12345678", 350, "Stark");
        Beneficent u4 = new Beneficent("23", "Thales Copia", "thales.cp@gmail.com", (long) 921111111, "22345678", 450, "Stark2", 300);

        //	userRepository.saveAll(Arrays.asList( u1));

        beneficentRepository.saveAll(Arrays.asList(u2, u3, u4));
    }
}