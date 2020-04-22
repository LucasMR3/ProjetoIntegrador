package com.Glass4Child.project.entities;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class address implements  Serializable  {
	private static final long serialVersionUID = 1L;
	 private String cep;
	 private String city;
	 private String neighborhood;
	 private String reference;
	 
	 private int number;
	    @OneToOne(mappedBy = "address")
	    private Beneficent User;
	 public address() {
		super();
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



	public address(String cep, String city, String neighborhood, String reference, int number
			) {
		super();
		this.cep = cep;
		this.city = city;
		this.neighborhood = neighborhood;
		this.reference = reference;
		
		this.number = number;
		
	}
	 
}
