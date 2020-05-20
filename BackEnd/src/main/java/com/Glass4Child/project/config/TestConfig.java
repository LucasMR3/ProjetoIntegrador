package com.Glass4Child.project.config;

import com.Glass4Child.project.entities.Address;
import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.entities.Benefited;
import com.Glass4Child.project.entities.Dependent;
import com.Glass4Child.project.repositories.AddressRepository;
import com.Glass4Child.project.repositories.BeneficentRepository;
import com.Glass4Child.project.repositories.BenefitedRepository;
import com.Glass4Child.project.repositories.DependentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private BeneficentRepository beneficentRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private BenefitedRepository benefitedRepository;
    @Autowired
    private DependentRepository DependentRepository;
    public void run(String... args) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<Dependent> ld=new ArrayList<Dependent>();
        Dependent d1 = new Dependent( "piralho","155155","11-05","filhao");
        Dependent d2=new Dependent( "piralha","155154","10-05","filha");
        ld.add(d1);
        ld.add(d2);
        DependentRepository.saveAll(Arrays.asList(d1,d2));
        Address ad1 = new Address(5859, "Residencial Masculino", "SP", "Sao Paulo", "Capão Redondo", "UNASP", "Estrada de Itapecerica");
        Address ad2 = new Address(1349, null, "SP", "Sao Paulo", "Berrini", "Praça no inicio da Berrini", "Rua Arizona");
        Address ad3 = new Address(1520, null, "SP", "Sao Paulo", "Berrini", "Sem referências", "Av Berrini");
        addressRepository.saveAll(Arrays.asList(ad1, ad2, ad3));

        Beneficent beneficent1 = new Beneficent("Thales Oliveira",  (long) 119999,  "12345678", 300, "T-Thalles", formatter.parse("1985-05-05"), ad1);
        Beneficent beneficent2 = new Beneficent("Thauã Oliveira", (long) 219999, "123456789", 500, 500,  "Sr-Thauã", formatter.parse("1985-05-05"),ad2);
        beneficentRepository.saveAll(Arrays.asList(beneficent1, beneficent2));

        Benefited benefited1 =  new Benefited("Joao Alves", (long)11921921, "394821911", 2, 3, "2020211", formatter.parse("1985-05-05"), ad3,ld);
        benefitedRepository.saveAll(Arrays.asList(benefited1));
    }
}