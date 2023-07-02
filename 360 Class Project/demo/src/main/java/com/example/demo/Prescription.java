package com.example.demo;

public class Prescription {
    // private instance variables for storing the patient's info
    private String  PatientName, Medication, PharmacyName, PharmacyLocation, PharmacyPhone, Note;
    // constructor of the Patient class takes the necessary information to create a Patient object and initializes the instance variables with the provided values
    public Prescription (String PatientName, String Medication, String PharmacyName, String PharmacyLocation, String PharmacyPhone, String Note) {

        this.PatientName = PatientName;
        this.Medication = Medication;
        this.PharmacyName = PharmacyName;
        this.Note = Note;
    }
    public String getPatientName() {                                                      // getter method that returns the patient's insurance ID
        return PatientName;
    }
    public String getMedication() {                                                      // getter method that returns the patient's insurance ID
        return Medication;
    }
    public String getPharmacyName() { return PharmacyName; }
    public String getPharmacyLocation() { return PharmacyLocation; }
    public String getPharmacyPhone() { return PharmacyPhone; }
    public String getNote() { return Note; }
}
