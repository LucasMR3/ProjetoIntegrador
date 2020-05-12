package com.Glass4Child.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;



@Entity
@Table(name = "tb_ADDRESS")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID_ADDRESS")
    private Long id;
    //	private String postalAddressCode; //TO DO: IMPLEMENT CLASS postalAddressCode
    private int number;
    private String streetAddress;
    private String complement;
    private String state;
    private String city;
    private String neighborhood;
    private String reference;

    @JsonIgnore
    @OneToOne(mappedBy = "address")
    private Beneficent beneficent;

    public Benefited getBenefited() {
        return benefited;
    }

    public void setBenefited(Benefited benefited) {
        this.benefited = benefited;
    }

    @JsonIgnore
    @OneToOne(mappedBy = "address")
    private Benefited benefited;
//    private User user; //user as FK
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
    public Beneficent getBeneficent() {
        return beneficent;
    }

    public void setBeneficent(Beneficent beneficent) {
        this.beneficent = beneficent;
    }

    public Address() {
    }

    public Address(int number, String complement, String state, String city, String neighborhood, String reference, String streetAddress) {
        this.number = number;
        this.complement = complement;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.reference = reference;
        this.streetAddress = streetAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return getNumber() == address.getNumber() &&
                getId().equals(address.getId()) &&
                streetAddress.equals(address.streetAddress) &&
                Objects.equals(getComplement(), address.getComplement()) &&
                getState().equals(address.getState()) &&
                getCity().equals(address.getCity()) &&
                getNeighborhood().equals(address.getNeighborhood()) &&
                getReference().equals(address.getReference());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumber(), streetAddress, getComplement(), getState(), getCity(), getNeighborhood(), getReference());
    }
}