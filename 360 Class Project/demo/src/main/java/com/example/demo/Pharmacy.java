package com.example.demo;

public class Pharmacy {
    String pharName;
    String pharLocation;
    int pharNumber;

    //Constructor
    public Pharmacy(String newName, String newLocation, int newPhone) {
        this.pharName = newName;
        this.pharLocation = newLocation;
        this.pharNumber = newPhone;
    }

    public String getPharName() {
        return pharName;
    }

    public String getPharLocation() {
        return pharLocation;
    }

    public int getPharNumber() {
        return pharNumber;
    }
}
