package com.example.demo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.time.LocalDate;

public class CreateAccountPage
{
    private Stage stage;

    public CreateAccountPage(Stage stage)
    {
        this.stage = stage; // CreateAccountPage constructor
    }

    public void show()
    {
        stage.setScene(createLayout());
        stage.show();
    }

    private Scene createLayout()
    {
        VBox leftLayout = new VBox();
        VBox infoLayout = new VBox(10);
        StackPane finalLayout = new StackPane();

        // Temporary back button that takes you to Login Page
        Button back = new Button("X");
        back.setStyle("-fx-background-color: #eaeaea; -fx-background-radius: 10; -fx-font-size: 20; -fx-alignment: center;");
        back.setOnAction(e -> {
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });

        //Spacer Label
        Label spacer = new Label(" ");
        spacer.setFont(Font.font(30));

        //Label for instructions on filling out information
        Label welcomeLabel1 = new Label("Your next step with Healfy");
        welcomeLabel1.setFont(Font.font("Arial", FontWeight.BLACK, 30));
        welcomeLabel1.setTextFill(Color.web("#9741A5"));

        Label welcomeLabel2 = new Label("Please enter all information below to get started");
        welcomeLabel2.setTextFill(Color.web("#9741A5"));

        //Label and text field for first name.
        Label firstnameLabel = new Label("First Name:");
        firstnameLabel.setTextFill(Color.web("#9741A5"));

        TextField firstnameField = new TextField();
        firstnameField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        firstnameField.setMaxWidth(250);

        //Label and text field for last name.
        Label lastnameLabel = new Label("Last Name:");
        lastnameLabel.setTextFill(Color.web("#9741A5"));

        TextField lastnameField = new TextField();
        lastnameField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        lastnameField.setMaxWidth(250);

        //Label and Date Picker for Date of birth.
        Label dateLabel = new Label("Date Of Birth:");
        dateLabel.setTextFill(Color.web("#9741A5"));

        DatePicker datePicker = new DatePicker();
        datePicker.setStyle("-fx-control-inner-background: #ECECEC; -fx-max-width: 250; -fx-background-color: #ECECEC");

        //Label and text field for phone number.
        Label phoneLabel = new Label("Phone Number:");
        phoneLabel.setTextFill(Color.web("#9741A5"));

        TextField phoneField = new TextField();
        phoneField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        phoneField.setMaxWidth(250);

        //Label and text field for username
        Label usernameLabel = new Label("Username:");
        usernameLabel.setTextFill(Color.web("#9741A5"));

        TextField usernameField = new TextField();
        usernameField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        usernameField.setMaxWidth(250);

        //Label and text field for password
        Label passwordLabel = new Label("Password:");
        passwordLabel.setTextFill(Color.web("#9741A5"));

        PasswordField passwordField = new PasswordField();
        passwordField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));
        passwordField.setMaxWidth(250);

        //Create account button.
        Button createAccountButton = new Button("Create Account");
        createAccountButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        createAccountButton.setMinWidth(100);
        createAccountButton.setOnAction(e -> {
            String firstName = firstnameField.getText();
            String lastName = lastnameField.getText();
            LocalDate dateOfBirth = datePicker.getValue();
            String phoneNumber = phoneField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();

            if(firstName.isEmpty() || lastName.isEmpty() || dateOfBirth == null || phoneNumber.isEmpty() || username.isEmpty() || password.isEmpty()) {
                // Handle empty fields
                Alert noFields = new Alert(Alert.AlertType.ERROR);
                noFields.setTitle("Error");                                           // Display string Error as alert title
                noFields.setHeaderText("Required Information Missing");                      // Display alert header
                noFields.showAndWait();
            }
            else
            {
                Account newAccount = new Account(firstName, lastName, phoneNumber, "", username, password);

                AccountManager accountManager = new AccountManager();
                accountManager.AddAccount(newAccount);

                System.out.println(newAccount);
                System.out.println(newAccount.getID());

                LoginPage loginPage = new LoginPage(stage);
                loginPage.show();
            }
        });

        //Logo Image
        ImageView imageView = new ImageView(new Image("Healfy-Logo.png"));
        imageView.setFitWidth(400);
        imageView.setPreserveRatio(true);

        //Creation of gathering all the information layout.
        infoLayout.getChildren().addAll(firstnameLabel, firstnameField, lastnameLabel, lastnameField, dateLabel,
                datePicker, phoneLabel, phoneField, usernameLabel, usernameField, passwordLabel, passwordField,
                createAccountButton);

        //Creation of the complete left side of scene.
        leftLayout.getChildren().addAll(welcomeLabel1, welcomeLabel2, spacer, infoLayout);

        //Completing the whole scene.
        finalLayout.getChildren().addAll(leftLayout, back, imageView);
        StackPane.setAlignment(leftLayout, Pos.CENTER);
        StackPane.setAlignment(back, Pos.TOP_RIGHT);
        StackPane.setAlignment(imageView, Pos.CENTER_RIGHT);
        finalLayout.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY)));
        finalLayout.setPadding(new Insets(20));
        Scene scene = new Scene(finalLayout, 300, 200);
        return scene;
    }
}
