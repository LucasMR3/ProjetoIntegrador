package com.Glass4Child.project.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "tb_BENEFITED")
public class Benefited extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer amountDependents;
    private Integer limitDependents;
    private String NIS;
    private Instant bornDate;

    @OneToOne
    private Address address;

    public Benefited() {
    }

    public Benefited(String name, Long telephone, String document, Integer amountDependents, Integer limitDependents, String NIS, Instant bornDate, Address address) {
        super(name, telephone, document);
        this.bornDate = bornDate;
        this.amountDependents = amountDependents;
        this.limitDependents = limitDependents;
        this.NIS = NIS;
        this.address = address;
    }

    public Integer getAmountDependents() {
        return amountDependents;
    }

    public void setAmountDependents(Integer amountDependents) {
        this.amountDependents = amountDependents;
    }

    public Integer getLimitDependents() {
        return limitDependents;
    }

    public void setLimitDependents(Integer limitDependents) {
        this.limitDependents = limitDependents;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public Instant getBornDate() {
        return bornDate;
    }

    public void setBornDate(Instant bornDate) {
        this.bornDate = bornDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Benefited benefited = (Benefited) o;
        return amountDependents.equals(benefited.amountDependents) &&
                limitDependents.equals(benefited.limitDependents) &&
                NIS.equals(benefited.NIS) &&
                bornDate.equals(benefited.bornDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountDependents, limitDependents, NIS, bornDate);
    }
}
