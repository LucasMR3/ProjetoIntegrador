package com.Glass4Child.project.entities;
import java.io.Serializable;
import java.util.Objects;
import com.Glass4Child.project.entities.User;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class address implements  Serializable  {
	private static final long serialVersionUID = 1L;

	private String document;
	private String cep;
	 private String city;
	 private String neighborhood;
	 private String reference;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		address address = (address) o;
		return document.equals(address.document);
	}

	@Override
	public int hashCode() {
		return Objects.hash(document);
	}

	private int number;





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
