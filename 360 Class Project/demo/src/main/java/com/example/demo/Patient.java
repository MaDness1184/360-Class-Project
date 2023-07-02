package com.example.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Patient extends Account
{
    // private instance variables for storing the patient's info
    private String Name, Temp, Weight, BloodPressure, HeartRate,
            Pain, Immun, Allergen, Meds, Notes;
    private int ID;

    public void setName(String name) {
        Name = name;
    }

    public void setTemp(String temp) {
        Temp = temp;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public void setBloodPressure(String bloodPressure)
    {
        BloodPressure = bloodPressure;
    }

    public void setHeartRate(String heartRate)
    {
        HeartRate = heartRate;
    }

    public void setPain(String pain) {
        Pain = pain;
    }

    public void setImmun(String immun) {
        Immun = immun;
    }

    public void setAllergen(String allergen)
    {
        Allergen = allergen;
    }

    public void setMeds(String meds)
    {
        Meds = meds;
    }

    public void setNotes(String notes)
    {
        Notes = notes;
    }

    // constructor of the Patient class takes the necessary information to create a Patient object and initializes the instance variables with the provided values
    public Patient(String pName, String pTemp, String pWeight, String pBloodPressure, String pHeartRate, String pPain, String pImmun, String pAllergen, String pMeds, String pID, String pNotes) {
        this.Name = pName;
        this.Temp = pTemp;
        this.Weight = pWeight;
        this.BloodPressure = pBloodPressure;
        this.HeartRate = pHeartRate;
        this.Pain = pPain;
        this.Immun = pImmun;
        this.Allergen = pAllergen;
        this.Meds = pMeds;
        this.ID = Integer.parseInt(pID);
        this.Notes = pNotes;
    }

    public String getName() {
        return Name;
    }

    public String getWeight() {
        return Weight;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public String getHeartRate() {
        return HeartRate;
    }

    public String getPain() {
        return Pain;
    }

    public String getImmun() {
        return Immun;
    }

    public String getAllergen() {
        return Allergen;
    }

    public String getMeds() {
        return Meds;
    }

    public int getID() {
        return ID;
    }

    public String getNotes() {
        return Notes;
    }

    public String getTemp() {
        return Temp;
    }

    private class Prescription {
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
/*
    public static void savePatientInfoToFile(Patient newPatient) {
        String patientFileName = newPatient.getID() + "_PatientExamData.txt";        // Create a patient file named xxxxx_PatientExamData.txt

        try (FileWriter fileWriter = new FileWriter(patientFileName)) {                    // Open try block and used for exception handling and ensures fileWriter resource is used properly

            fileWriter.write("Patient Name: " + newPatient.getName());
            fileWriter.write("\nPatient ID: " + newPatient.getID());
            fileWriter.write("\nTemperature: " + newPatient.getTemp());
            fileWriter.write("\nWeight: " + newPatient.getWeight());
            fileWriter.write("\nBlood Pressure: " + newPatient.getBloodPressure());
            fileWriter.write("\nHeart Rate: " + newPatient.getHeartRate());
            fileWriter.write("\nPain Level: " + newPatient.getPain());
            fileWriter.write("\nImmunizations: " + newPatient.getImmun());
            fileWriter.write("\nAllergens: " + newPatient.getAllergen());
            fileWriter.write("\nCurrent Medications: " + newPatient.getMeds());
            fileWriter.write("\nNotes: " + newPatient.getNotes());


        } catch (
                IOException event) {       // This line starts a catch block and specifies that if an IOException occurs within the try block, the following code will handle the exception
            event.printStackTrace();        // prints the stack trace of the exception that occurred, providing information about where and how the exception was thrown
        }
    }

    private void savePrescriptionInfoToFile(ExaminationPortal.Prescription newPrescription) {
        String prescriptionFileName = newPrescription.getPatientName() + "_Medication.txt";      // Create a patient file named Name_Medication.txt

        try (FileWriter fileWriter = new FileWriter(prescriptionFileName)) {                    // Open try block and used for exception handling and ensures fileWriter resource is used properly

            fileWriter.write("Patient Name: " + newPrescription.getPatientName());
            fileWriter.write("\nMedication: " + newPrescription.getMedication());
            fileWriter.write("\nPharmacy: " + newPrescription.getPharmacyName());
            fileWriter.write("\nPharmacy: " + newPrescription.getPharmacyLocation());
            fileWriter.write("\nPharmacy: " + newPrescription.getPharmacyPhone());
            fileWriter.write("\nNotes: " + newPrescription.getNote());

        } catch (IOException event) {       // This line starts a catch block and specifies that if an IOException occurs within the try block, the following code will handle the exception
            event.printStackTrace();        // prints the stack trace of the exception that occurred, providing information about where and how the exception was thrown
        }
    }
    */
}