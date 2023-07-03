package com.example.demo;
import javafx.application.Application;
import javafx.scene.control.DatePicker;

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

    public void AddMessage(Message message)
    {
        messages.add(message);
    }

    // default constructor
    public Account () {
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

    public String getFirstName() {return firstName;}

    public int getID()
    {
        return userId;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    // need message stuff to be made first
    public void addMessage() {
        //todo
    }

    public void deleteMessage() {
        //todo
    }

}

