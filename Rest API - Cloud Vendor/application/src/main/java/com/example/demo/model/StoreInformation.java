package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    private String storeName;
    private String storeAddress;
    private String storeContact;
    private String storeEmail;


    public StoreInformation() {
    }

    public StoreInformation(String storeName, String storeAddress, String storeContact, String storeEmail)
    {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeContact = storeContact;
        this.storeEmail = storeEmail;
    }

    public int getStoreId() {
        return storeId;
    }


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    @Override
    public String toString() {
        return "StoreInformation{" +
                "storeId='" + storeId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeContact='" + storeContact + '\'' +
                ", storeEmail='" + storeEmail + '\'' +
                '}';
    }

}
