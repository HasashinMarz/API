package com.app.carhire.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "OWNER")
public class Owner {
    @Id
    @Column(name = "OWNER_ID")
    private Long ownerId;
    @Column(name = "OWNER_NAME")
    private String ownerName;
    @Column(name = "OWNER_PHONE")
    private int phoneNumber;
    @Column(name = "OWNER_EMAIL")
    private String emailAddress;

    public Owner(Long ownerId, String ownerName, int phoneNumber, String emailAddress) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Owner(){

    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


}
