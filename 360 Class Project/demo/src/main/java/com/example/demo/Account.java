package com.example.demo;
import javafx.application.Application;
import java.io.IOException;
import java.util.Random;

public class Account {
    protected String firstName;
    protected String lastName;
    protected String phoneNum;
    protected String email;
    protected int userId;
    protected String username;
    protected String password;
    protected boolean isNurse;
    protected boolean isDoctor;

    //todo
    //private messages list<message>;

    // should probably be moved to accountManager, it's just here to show how ID's could be done
    private int count = 0;

    // default constructor
    public Account () {
        this.firstName = "John";
        this.lastName = "Doe";
        this.phoneNum = "0000000000";
        this.email = "N/A";
        this.userId = idGen();
        this.username = "N/A";
        this.password = "N/A";
        this.isNurse = false;
        this.isDoctor = false;
    }

    // the correct constructor to be used by reception form
    public Account(String firstName, String lastName, String phoneNum, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.userId = idGen();
        this.username = username;
        this.password = password;
        this.isNurse = false;
        this.isDoctor = false;
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

    // checks if account is staff or not
    public boolean isStaff () {

        return (this.isNurse == true || this.isDoctor == true);

    }
}

