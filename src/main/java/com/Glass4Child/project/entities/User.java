package com.Glass4Child.project.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String document;
    private String name;
    private Long telephone;

    @OneToOne
    protected Address address;

    public User() {
    }

    public User(String name, Long telephone, String document, Address address) {
        super();
        this.name = name;
        this.telephone = telephone;
        this.document = document;
        this.address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(document, user.document) &&
                Objects.equals(telephone, user.telephone);
    }

    public int hashCode() {
        return Objects.hash(name, document, telephone);
    }
}