package com.example.project128;

public class ContactsDomain {
    private String name;
    private String picAddress;

    public ContactsDomain(String name, String picAddress) {
        this.name = name;
        this.picAddress = picAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }
}
