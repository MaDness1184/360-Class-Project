package com.example.demo;
import javafx.application.Application;
import javafx.scene.control.DatePicker;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Account {
    protected String firstName;
    protected String lastName;
    protected String phoneNum;
    protected String email;
    protected LocalDate birthday;
    protected int userId;
    protected String username;
    protected String password;
    protected boolean isStaff;


    //todo
    private List<Message> messages = new ArrayList<>();

    public void AddMessage(Message message) {
        messages.add(message);
    }

    // default constructor
    public Account() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.birthday = null;
        this.phoneNum = "0000000000";
        this.email = "N/A";
        this.userId = idGen();
        this.username = "N/A";
        this.password = "N/A";
        this.isStaff = false;
    }

    // the correct constructor to be used by reception form
    public Account(String firstName, String lastName, LocalDate dateOfBirth, String phoneNum, String email, String username, String password, boolean isStaff) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = dateOfBirth;
        this.phoneNum = phoneNum;
        this.email = email;
        this.userId = idGen();
        this.username = username;
        this.password = password;
        this.isStaff = isStaff;
    }

    // uses count to generate sequential user IDs
    private int idGen() {
        int temp = ++AccountManager.count;
        return temp;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getID() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    // need message stuff to be made first
    public void addMessage() {
        //todo
    }

    public void deleteMessage() {
        //todo
    }

    public static void saveAccountInfoToFile(Account newAccount) {
        String patientFileName = newAccount.getID() + "_PatientExamData.txt";        // Create a patient file named xxxxx_PatientExamData.txt

        try (FileWriter fileWriter = new FileWriter(patientFileName)) {                    // Open try block and used for exception handling and ensures fileWriter resource is used properly

            fileWriter.write("First Name: " + newAccount.getFirstName());
            fileWriter.write("\nLast Name: " + newAccount.getLastName());
            fileWriter.write("\nPatient ID: " + newAccount.getID());
            fileWriter.write("\nBirthday: " + newAccount.getBirthday());
            fileWriter.write("\nPhone Number: " + newAccount.getPhoneNum());
            fileWriter.write("\nUsername: " + newAccount.getUsername());
            fileWriter.write("\nPassword: " + newAccount.getPassword());


        } catch (
                IOException event) {       // This line starts a catch block and specifies that if an IOException occurs within the try block, the following code will handle the exception
            event.printStackTrace();        // prints the stack trace of the exception that occurred, providing information about where and how the exception was thrown
        }

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setStaff(boolean staff) {
        isStaff = staff;
    }
}
