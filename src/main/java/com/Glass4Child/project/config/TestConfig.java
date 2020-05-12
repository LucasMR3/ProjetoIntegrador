package com.Glass4Child.project.config;

import com.Glass4Child.project.entities.Address;
import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.entities.Benefited;
import com.Glass4Child.project.repositories.AddressRepository;
import com.Glass4Child.project.repositories.BeneficentRepository;
import com.Glass4Child.project.repositories.BenefitedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private BeneficentRepository beneficentRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private BenefitedRepository benefitedRepository;

    public void run(String... args) throws Exception {

        Address ad1 = new Address(5859, "Residencial Masculino", "SP", "Sao Paulo", "Capão Redondo", "UNASP", "Estrada de Itapecerica");
        Address ad2 = new Address(1349, null, "SP", "Sao Paulo", "Berrini", "Praça no inicio da Berrini", "Rua Arizona");
        Address ad3 = new Address(1520, null, "SP", "Sao Paulo", "Berrini", "Sem referências", "Av Berrini");
        addressRepository.saveAll(Arrays.asList(ad1, ad2, ad3));

        Beneficent beneficent1 = new Beneficent("Thales Oliveira",  (long) 119999,  "12345678", 300, "T-Thalles", Instant.parse("1992-05-11T17:57:35.000Z"), ad1);
        Beneficent beneficent2 = new Beneficent("Thauã Oliveira", (long) 219999, "123456789", 500, 500,  "Sr-Thauã", Instant.parse("1990-01-01T12:10:00.000Z"),ad2);
        beneficentRepository.saveAll(Arrays.asList(beneficent1, beneficent2));

        Benefited benefited1 =  new Benefited("Joao Alves", (long)11921921, "394821911", 2, 3, "2020211", Instant.parse("1987-03-14T00:00:00.000Z"), ad3);
        benefitedRepository.saveAll(Arrays.asList(benefited1));
    }
}