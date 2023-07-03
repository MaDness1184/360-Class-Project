package com.example.demo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LoginPage loginPage = new LoginPage(stage);

        // Staff Accounts
        String firstName, lastName, phoneNum, email, username, password;
        LocalDate dateOfBirth;
        firstName = "Dr. Fu";
        lastName = "Bar";
        dateOfBirth = null;
        phoneNum = "951-886-5555";
        email = "fubarmd@healfy.com";
        username = "fubar";
        password = "password1";
        Account doctor = new Account(firstName, lastName, dateOfBirth, phoneNum, email, username, password);

        firstName = "Missy";
        lastName = "Pissy";
        dateOfBirth = null;
        phoneNum = "951-390-4563";
        email = "misspiss@healfy.com";
        username = "misspiss";
        password = "password2";
        Account nurse = new Account(firstName, lastName, dateOfBirth, phoneNum, email, username, password);

        AccountManager.AddAccount(doctor);
        AccountManager.AddAccount(nurse);

        // Set preferred window size
        stage.setWidth(800);
        stage.setHeight(600);

        // Set minimum window size
        stage.setMinWidth(400);
        stage.setMinHeight(300);

        loginPage.show(); // Display initial Login Page as start for the UI
    }

    public static void main(String[] args) {
        launch();
    }
}