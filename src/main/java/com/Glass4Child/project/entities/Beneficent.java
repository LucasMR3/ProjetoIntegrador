
package com.Glass4Child.project.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Beneficent extends User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int donationLimit = 0;
    private int totalDonatedBeneficient = 0;
    private boolean everDonated = false;

    public Beneficent(){
    }

    public Beneficent(Long document, String name, String email, String address, String password, int donationLimit) {
        super(document, name, email, address, password);
        this.donationLimit = donationLimit;
        this.totalDonatedBeneficient = 0;
        this.everDonated = false;
    }

    public int getDonationLimit() {
        return donationLimit;
    }

    public void setDonationLimit(int DonationLimit) {
        this.donationLimit = DonationLimit;
    }

    public int getTotalDonatedBeneficient() {
        return totalDonatedBeneficient;
    }

    public void setTotalDonatedBeneficient(int totalDonatedBeneficient) {
        this.totalDonatedBeneficient = totalDonatedBeneficient;
    }

    public boolean isEverDonated() {
        return everDonated;
    }

    public void setEverDonated(boolean EverDonated) {
        this.everDonated = EverDonated;
    }

    public void setNewDonationLimit(int value) {
        if (this.donationLimit > value) {
            this.donationLimit = value;
        }
        this.totalDonatedBeneficient = value + this.totalDonatedBeneficient;
    }

}
