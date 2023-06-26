package com.example.demo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoginPage {
    private Stage stage;

    public LoginPage(Stage stage) {
        this.stage = stage; // LoginPage constructor
    }

    public void show() {
        VBox layout = createLayout(); // Creating initial layout as a VBOX
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        layout.requestFocus(); // Requesting focus to the layout and not any text fields, etc.
        stage.show();
    }

    private VBox createLayout() {
        // VBox to encapsulate all content
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setAlignment(Pos.CENTER); // Center Alignment
        layout.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY))); // Setting background color

        // Welcome Greeting
        Label welcomeLabel = new Label("Welcome to Healfy");
        welcomeLabel.setFont(Font.font("Arial", FontWeight.BLACK, 42));
        welcomeLabel.setTextFill(Color.web("#9741A5"));

        // Instruction to login or create account
        Label signInLabel = new Label("Please sign in or create a new account");
        signInLabel.setTextFill(Color.web("#9741A5"));

        // Text field to enter username or ID
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        usernameField.setMaxWidth(225);

        // Password field
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        passwordField.setMaxWidth(225);

        // Login button that when clicked takes you to the patient portal
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        loginButton.setMinWidth(100);
        loginButton.setOnAction(e -> {
            PatientPortal patientPortal = new PatientPortal(stage);
            patientPortal.show();
        });

        // Create account button that takes you to create account page
        Button createAccountButton = new Button("Create Account");
        createAccountButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        createAccountButton.setMinWidth(100);
        createAccountButton.setOnAction(e -> {
            CreateAccountPage createAccountPage = new CreateAccountPage(stage);
            createAccountPage.show();
        });

        // Adding all children and returning layout
        layout.getChildren().addAll(welcomeLabel, signInLabel, usernameField, passwordField, loginButton, createAccountButton);
        return layout;
    }
}