
package com.Glass4Child.project.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Beneficent extends User implements Serializable {

    private static final long serialVersionUID = 1L;
    private int donationLimit = 0;
    private int totalDonatedBeneficient = 0;
    private boolean everDonated = false;
    private String pseudonym;
  
    public Beneficent(String name, String email, String password, long telephone, String document, int donationLimit, String pseudonym, address address) {
    super(name, email, telephone, password, document, address);
   
		this.donationLimit = donationLimit;
		
		this.pseudonym = pseudonym;
    
    }

   

   



	public Beneficent() {
		
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

    public void setNewDonationLimit(int value) {
        if (this.donationLimit > value) {
            this.donationLimit = value;
        }
        this.totalDonatedBeneficient = value + this.totalDonatedBeneficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Beneficent that = (Beneficent) o;
        return donationLimit == that.donationLimit &&
                totalDonatedBeneficient == that.totalDonatedBeneficient &&
                everDonated == that.everDonated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), donationLimit, totalDonatedBeneficient, everDonated);
    }
}
