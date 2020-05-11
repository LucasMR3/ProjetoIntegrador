package com.Glass4Child.project.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "tb_BENEFICENT")
public class Beneficent extends User implements Serializable {
    private static final long serialVersionUID = 1L;
//    @AllArgsConstructor
//    @Getter
//    @Setter

    private int donationLimit = 0;
    private int totalDonated = 0;
    private boolean everDonated = false;
    private String pseudonym;
    private Instant bornDate;

    public Beneficent() {
    }

    public Beneficent(String name, Long telephone, String document, int donationLimit, int totalDonatedBeneficent, String pseudonym, Instant bornDate, Address address) {
        super(name, telephone, document);
        this.donationLimit = donationLimit;
        this.totalDonated = totalDonatedBeneficent;
        this.everDonated = true;
        this.pseudonym = pseudonym;
        this.bornDate = bornDate;
        this.address = address;
    }

    public Beneficent(String name, Long telephone, String document, int donationLimit, String pseudonym, Instant bornDate, Address address) {
        super(name, telephone, document);
        this.donationLimit = donationLimit;
        this.totalDonated = 0;
        this.everDonated = false;
        this.pseudonym = pseudonym;
        this.bornDate = bornDate;
        this.address = address;
    }

    @OneToOne
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getDonationLimit() {
        return donationLimit;
    }

    public void setDonationLimit(int DonationLimit) {
        this.donationLimit = DonationLimit;
    }

    public int getTotalDonated() {
        return totalDonated;
    }

    public void setTotalDonated(int totalDonated) {
        this.totalDonated = totalDonated;
    }

    public Instant getBornDate() {
        return bornDate;
    }

    public void setBornDate(Instant bornDate) {
        this.bornDate = bornDate;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public boolean isEverDonated() {
        return everDonated;
    }

    public void setEverDonated(boolean EverDonated) {
        this.everDonated = EverDonated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Beneficent that = (Beneficent) o;
        return donationLimit == that.donationLimit &&
                totalDonated == that.totalDonated &&
                everDonated == that.everDonated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), donationLimit, totalDonated, everDonated);
    }
}
