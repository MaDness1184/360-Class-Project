package com.example.demo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.text.TextAlignment;

public class VitalsPanel {
    private Stage stage;

    public VitalsPanel(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        VBox layout = createLayout();
        Scene scene = new Scene(layout, 1000, 1000);
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setMinWidth(450);
        stage.setMinHeight(600);
        stage.setScene(scene);
        stage.setTitle("Vitals Panel");
        stage.show();
        layout.requestFocus();
        layout.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY)));

    }

    private VBox createLayout() {

        // Set Title for the examination layout
        Label titleLabel = new Label("Preliminary Examination");
        titleLabel.setFont(Font.font("Arial", FontWeight.BLACK, 25));
        titleLabel.setTextFill(Color.web("#9741A5"));
        titleLabel.setAlignment(Pos.TOP_LEFT);
        titleLabel.setPadding(new Insets(3));

        // Create physical exam labels
        Label PhysicalExam = new Label("Physical Exam: ");
        PhysicalExam.setFont(Font.font("Arial", FontWeight.BLACK, 15));
        PhysicalExam.setTextFill(Color.web("#9741A5"));
        PhysicalExam.setPadding(new Insets(4));
        PhysicalExam.setAlignment(Pos.CENTER_LEFT);

        Label patientName = new Label("Patient Name: ");
        patientName.setTextFill(Color.web("#9741A5"));
        TextField nameText = new TextField();
        nameText.setPrefWidth(225);
        nameText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label tmeperature = new Label("Temperature: ");
        tmeperature.setTextFill(Color.web("#9741A5"));
        TextField tmeperatureText = new TextField();
        tmeperatureText.setPrefWidth(225);
        tmeperatureText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label weight = new Label("Weight: ");
        weight.setTextFill(Color.web("#9741A5"));
        TextField weightText = new TextField();
        weightText.setPrefWidth(225);
        weightText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label bloodPressure = new Label("Blood Pressure: ");
        bloodPressure.setTextFill(Color.web("#9741A5"));
        TextField bloodPressureText = new TextField();
        bloodPressureText.setPrefWidth(225);
        bloodPressureText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label heartRate = new Label("Heart Rate: ");
        heartRate.setTextFill(Color.web("#9741A5"));
        TextField heartRateText = new TextField();
        heartRateText.setPrefWidth(225);
        heartRateText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label pain = new Label("Pain Level: ");
        pain.setTextFill(Color.web("#9741A5"));
        TextField painText = new TextField();
        painText.setPrefWidth(225);
        painText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label immunizations = new Label("Immunizations: ");
        immunizations.setTextFill(Color.web("#9741A5"));
        TextArea immunizationText = new TextArea();
        immunizationText.setPrefWidth(225);
        immunizationText.setPrefHeight(75);
        immunizationText.setWrapText(true);
        immunizationText.setStyle("-fx-text-alignment: left;");
        immunizationText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label allergens = new Label("Allergens: ");
        allergens.setTextFill(Color.web("#9741A5"));
        TextArea allergenText = new TextArea();
        allergenText.setPrefWidth(225);
        allergenText.setPrefHeight(75);
        allergenText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label medications = new Label("Current Medications: ");
        medications.setTextFill(Color.web("#9741A5"));
        TextArea medicationText = new TextArea();
        medicationText.setPrefWidth(225);
        medicationText.setPrefHeight(75);
        medicationText.setWrapText(true);
        medicationText.setStyle("-fx-text-alignment: left;");
        medicationText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label misc = new Label("Misc: ");
        misc.setFont(Font.font("Arial", FontWeight.BLACK, 18));
        misc.setTextFill(Color.web("#9741A5"));
        misc.setPadding(new Insets(10));

        Label patientID = new Label("Patient ID number: ");
        patientID.setTextFill(Color.web("#9741A5"));
        TextField patientIDText = new TextField();
        patientIDText.setPrefWidth(225);
        patientIDText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label notes = new Label("Notes: ");
        notes.setTextFill(Color.web("#9741A5"));
        TextArea notesText = new TextArea();
        notesText.setPrefWidth(225);
        notesText.setPrefHeight(350);
        notesText.setWrapText(true);
        notesText.setStyle("-fx-text-alignment: left;");
        notesText.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));


        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        submitButton.setPrefWidth(70);
        submitButton.setPrefHeight(25);
        submitButton.setOnAction(e -> {

            // Retrieves the text entered
            String pName = nameText.getText();
            String pTemp= tmeperatureText.getText();
            String pWeight = weightText.getText();
            String pBloodPressure= bloodPressureText.getText();
            String pHeartRate= heartRateText.getText();
            String pPain= painText.getText();
            String pImmun= immunizationText.getText();
            String pAllergen= allergenText.getText();
            String pMeds= medicationText.getText();
            String pID= patientIDText.getText();
            String pNotes = notesText.getText();



            // Create patient information FILE
            Patient newPatient = new Patient(pName, pTemp, pWeight, pBloodPressure, pHeartRate, pPain, pImmun, pAllergen, pMeds, pID, pNotes);
            Patient.savePatientInfoToFile(newPatient);

            // Display success message after save button is clicked
            Alert intakeAlert = new Alert(Alert.AlertType.INFORMATION);
            intakeAlert.setTitle("Success");
            intakeAlert.setHeaderText("Patient ID: " + pID);
            intakeAlert.setContentText("The data has been saved successfully");
            intakeAlert.showAndWait();

            // Clear the input fields
            nameText.clear();
            tmeperatureText.clear();
            weightText.clear();
            bloodPressureText.clear();
            heartRateText.clear();
            painText.clear();
            immunizationText.clear();
            allergenText.clear();
            medicationText.clear();
            patientIDText.clear();
            notesText.clear();


        });

        // Back to main view (Log out button)
        Button LogoutButton = new Button("Logout");      // Create Log Out button
        LogoutButton.setStyle("-fx-background-color: #FFA500; -fx-background-radius: 5");
        LogoutButton.setPrefWidth(70);
        LogoutButton.setPrefHeight(25);
        LogoutButton.setAlignment(Pos.CENTER);
        LogoutButton.setOnAction(event -> {                 // Take user back to login page view
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });

        VBox PhysicalExamSection = new VBox(1,PhysicalExam, patientName, nameText, tmeperature, tmeperatureText, weight, weightText, bloodPressure, bloodPressureText, heartRate, heartRateText,
                pain, painText, immunizations, immunizationText, allergens, allergenText, medications, medicationText,submitButton );

        PhysicalExamSection.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY)));
        PhysicalExamSection.setPadding(new Insets(20, 20, 20, 20));
        PhysicalExamSection.setAlignment(Pos.CENTER_LEFT);


        VBox Misc = new VBox(1, misc, patientID, patientIDText, notes, notesText);
        Misc.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY)));
        Misc.setPadding(new Insets(20, 20, 20, 20));
        Misc.setAlignment(Pos.CENTER_LEFT);

        HBox Hlayout = new HBox();
        Hlayout.setSpacing(80);
        Hlayout.getChildren().addAll(PhysicalExamSection, Misc);
        Hlayout.setAlignment(Pos.CENTER);

        HBox LogoutButtonLayout = new HBox();
        LogoutButtonLayout.getChildren().addAll(LogoutButton);
        LogoutButtonLayout.setAlignment(Pos.BOTTOM_RIGHT);
        LogoutButtonLayout.setPadding(new Insets(0,10,10,0));


        VBox layout = new VBox();
        layout.getChildren().addAll(titleLabel, Hlayout, LogoutButtonLayout);
        return layout;
    }
}


