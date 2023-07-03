package com.example.demo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PatientPortal
{
    private Stage stage;

    public PatientPortal(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        stage.setScene(createScene());
        stage.show();
    }

    private Scene createScene() {
        BorderPane root = new BorderPane();
        Account activeAccount = AccountManager.activeAccount;

        VBox leftVBox = new VBox();
        leftVBox.setAlignment(Pos.TOP_CENTER);
        leftVBox.setPrefHeight(420);
        leftVBox.setPrefWidth(215);
        root.setLeft(leftVBox);

        ImageView logo = new ImageView();
        logo.setFitHeight(150);
        logo.setFitWidth(200);
        logo.setPickOnBounds(true);
        logo.setPreserveRatio(true);
        Image image1 = new Image("Healfy-Logo.png");
        logo.setImage(image1);
        leftVBox.getChildren().add(logo);

        Label patientIDLabel = new Label("Patient ID: " + activeAccount.getID());
        patientIDLabel.setTextFill(Color.web("#9741a5"));
        patientIDLabel.setUnderline(true);
        patientIDLabel.setFont(new Font(18));
        leftVBox.getChildren().add(patientIDLabel);

        Button changeInfoButton = new Button("Change Information");

        changeInfoButton.setStyle("-fx-background-color: #E2CE15;");
        changeInfoButton.setFont(new Font(20));
        leftVBox.getChildren().add(changeInfoButton);
        changeInfoButton.setOnAction(e -> {
            CreateAccountPage createAccountPage = new CreateAccountPage(stage);
            createAccountPage.showNewInfo();
        });

        Button logoutButton = new Button("Logout");
        logoutButton.setPrefHeight(45);
        logoutButton.setPrefWidth(200);
        logoutButton.setStyle("-fx-background-color: #F17C0F;");
        logoutButton.setFont(new Font(20));
        VBox.setMargin(logoutButton, new Insets(5));
        leftVBox.getChildren().add(logoutButton);
        logoutButton.setOnAction(event -> {
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });

        VBox bottomVBox = new VBox();
        bottomVBox.setAlignment(Pos.CENTER);
        bottomVBox.setPrefHeight(220);
        bottomVBox.setPrefWidth(800);
        root.setBottom(bottomVBox);


        BorderPane centerBorderPane = new BorderPane();
        centerBorderPane.setPrefHeight(420);
        centerBorderPane.setPrefWidth(600);
        root.setCenter(centerBorderPane);

        VBox centerVBox = new VBox();
        centerVBox.setAlignment(Pos.TOP_CENTER);
        centerVBox.setPrefHeight(200);
        centerVBox.setPrefWidth(100);
        centerBorderPane.setCenter(centerVBox);

        Label welcomeLabel = new Label("Welcome Back, " + activeAccount.getFirstName());
        welcomeLabel.setTextFill(Color.web("#9741a5"));
        welcomeLabel.setFont(new Font(30));
        centerVBox.getChildren().add(welcomeLabel);

        Label PatientIDLabel = new Label("Patient ID:");
        PatientIDLabel.setTextFill(Color.web("#9741a5"));
        PatientIDLabel.setFont(new Font(20));
        leftVBox.getChildren().add(PatientIDLabel);

        TextField recordID = new TextField();
        recordID.setStyle("-fx-background-radius: 10; -fx-background-color: #ECECEC;");
        recordID.setFont(new Font(20));
        VBox.setMargin(recordID, new Insets(5));
        leftVBox.getChildren().add(recordID);

        Label patientRecordLabel = new Label("Patient Records:");
        patientRecordLabel.setTextFill(Color.web("#9741a5"));
        patientRecordLabel.setFont(new Font(20));
        leftVBox.getChildren().add(patientRecordLabel);

        TextArea recordView = new TextArea();
        recordView.setPrefHeight(420);
        recordView.setPrefWidth(230);
        recordView.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        recordView.setWrapText(true); // Enable text wrapping
        VBox.setMargin(recordView, new Insets(5));
        leftVBox.getChildren().add(recordView);


        Button viewButton = new Button("  View  ");
        viewButton.setStyle("-fx-background-color: #E2CE15;");
        viewButton.setFont(new Font(15));
        leftVBox.getChildren().add(viewButton);
        viewButton.setOnAction(e -> {
            String recordIDText = recordID.getText();
            String examinationFileName = recordIDText+ "_PatientExamData.txt";


            StringBuilder recordBuilder = new StringBuilder();

            // Read patient examination data
            try (BufferedReader reader = new BufferedReader(new FileReader(examinationFileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    recordBuilder.append(line).append("\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            // Set the text of recordView with the combined data
            recordView.setText(recordBuilder.toString());
        });

        Label patientNameLabel = new Label("Patient Name:");
        patientNameLabel.setTextFill(Color.web("#9741a5"));
        patientNameLabel.setFont(new Font(20));
        leftVBox.getChildren().add(patientNameLabel);

        TextField PatientName = new TextField();
        PatientName.setStyle("-fx-background-radius: 10; -fx-background-color: #ECECEC;");
        PatientName.setFont(new Font(20));
        VBox.setMargin(PatientName, new Insets(5));
        leftVBox.getChildren().add(PatientName);

        Label patientPharmacyInfo = new Label("Pharmacy Infomation:");
        patientPharmacyInfo.setTextFill(Color.web("#9741a5"));
        patientPharmacyInfo.setFont(new Font(20));
        leftVBox.getChildren().add(patientPharmacyInfo);

        TextArea PharrecordView = new TextArea();
        PharrecordView.setPrefHeight(420);
        PharrecordView.setPrefWidth(230);
        PharrecordView.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        PharrecordView.setWrapText(true); // Enable text wrapping
        VBox.setMargin(PharrecordView, new Insets(5));
        leftVBox.getChildren().add(PharrecordView);

        Button viewButton1 = new Button("  View  ");
        viewButton1.setStyle("-fx-background-color: #E2CE15;");
        viewButton1.setFont(new Font(15));
        leftVBox.getChildren().add(viewButton1);
        viewButton1.setOnAction(e -> {
            String recordNameText = PatientName.getText();
            String prescriptionFileName = recordNameText + "_Medication.txt";

            StringBuilder PharRecordBuilder = new StringBuilder();

            // Read patient prescription data
            try (BufferedReader reader = new BufferedReader(new FileReader(prescriptionFileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    PharRecordBuilder.append(line).append("\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            // Set the text of PharRecordView with the prescription data
            PharrecordView.setText(PharRecordBuilder.toString());
        });

        Button messageButton = new Button("Message Portal");
        messageButton.setStyle("-fx-background-color: #E2CE15;");
        messageButton.setFont(new Font(20));
        VBox.setMargin(messageButton, new Insets(5));
        centerVBox.getChildren().add(messageButton);
        messageButton.setOnAction(e ->  {
            MessagePanel messagePanel = new MessagePanel(stage);
            messagePanel.show();
        });



        Scene scene = new Scene(root, 1600, 1200);
        return scene;
    }
}
