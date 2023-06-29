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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class ExaminationPortal {
    private Stage stage;

    public ExaminationPortal(Stage stage) {
        this.stage = stage; // ExaminationPage constructor
    }

    public void show() {
        BorderPane layout = createBorderPane();
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
        layout.requestFocus();
        layout.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY)));
    }



    private BorderPane createBorderPane() {


        // Set Title for the examination layout
        Label titleLabel = new Label("Healfy");
        titleLabel.setFont(Font.font("Arial", FontWeight.BLACK, 30));
        titleLabel.setTextFill(Color.web("#9741A5"));
        titleLabel.setAlignment(Pos.TOP_LEFT);
        titleLabel.setPadding(new Insets(5));

        // Create physical exam labels
        Label PhysicalExam = new Label("Physical Exam: ");
        PhysicalExam.setFont(Font.font("Arial", FontWeight.BLACK, 18));
        PhysicalExam.setTextFill(Color.web("#9741A5"));
        PhysicalExam.setPadding(new Insets(10));
        PhysicalExam.setAlignment(Pos.CENTER_LEFT);

        Label VitalSigns = new Label("Vital Signs: ");
        VitalSigns.setTextFill(Color.web("#9741A5"));
        TextField VSTextField = new TextField();
        VSTextField.setMaxWidth(225);
        VSTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));


        Label VisionAcuity = new Label("Vision Acuity: ");
        VisionAcuity.setTextFill(Color.web("#9741A5"));
        TextField VATextField = new TextField();
        VATextField.setMaxWidth(225);
        VATextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));


        Label CardiovascularHealth = new Label("Cardiovascular Health: ");
        CardiovascularHealth.setTextFill(Color.web("#9741A5"));
        TextField CHTextField = new TextField();
        CHTextField.setMaxWidth(225);
        CHTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label RespiratoryHealth = new Label("Respiratory Health: ");
        RespiratoryHealth.setTextFill(Color.web("#9741A5"));
        TextField RHTextField = new TextField();
        RHTextField.setMaxWidth(225);
        RHTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label NeuroHealth = new Label("Neuro Health: ");
        NeuroHealth.setTextFill(Color.web("#9741A5"));
        TextField NHTextField = new TextField();
        NHTextField.setMaxWidth(225);
        NHTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label MusculoskeletalAssessment = new Label("Musculoskeletal Assessment: ");
        MusculoskeletalAssessment.setTextFill(Color.web("#9741A5"));
        TextField MATextField = new TextField();
        MATextField.setMaxWidth(225);
        MATextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label SkinAndLymphNodes = new Label("Skin and Lymph Nodes: ");
        SkinAndLymphNodes.setTextFill(Color.web("#9741A5"));
        TextField SLNTextField = new TextField();
        SLNTextField.setMaxWidth(225);
        SLNTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label Diagnosis = new Label("Diagnosis: ");
        Diagnosis.setTextFill(Color.web("#9741A5"));
        TextField DiagTextField = new TextField();
        DiagTextField.setMaxWidth(225);
        DiagTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label PrescribeMedication = new Label("Prescribe Medication: ");
        PrescribeMedication.setFont(Font.font("Arial", FontWeight.BLACK, 18));
        PrescribeMedication.setTextFill(Color.web("#9741A5"));
        PrescribeMedication.setPadding(new Insets(10));

        Label Medication = new Label("Medication: ");
        Medication.setTextFill(Color.web("#9741A5"));
        TextField MedTextField = new TextField();
        MedTextField.setMaxWidth(225);
        MedTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label Pharmacy = new Label("Pharmacy: ");
        Pharmacy.setTextFill(Color.web("#9741A5"));
        TextField PharTextField = new TextField();
        PharTextField.setMaxWidth(225);
        PharTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label Notes = new Label("Notes: ");
        Notes.setTextFill(Color.web("#9741A5"));
        TextField NoteTextField = new TextField();
        NoteTextField.setMaxWidth(225);
        NoteTextField.setMaxHeight(300);
        NoteTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));


        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        submitButton.setPrefWidth(70);
        submitButton.setPrefHeight(25);

        // Send Prescription Button
        Button SendPreButton = new Button("Send Prescription");
        SendPreButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        SendPreButton.setPrefWidth(150);
        SendPreButton.setPrefHeight(30);
        SendPreButton.setAlignment(Pos.CENTER);


        // Back to main view (Log out button)
        Button LogoutButton = new Button("Logout");      // Create Log Out button
        LogoutButton.setStyle("-fx-background-color: #FFA500; -fx-background-radius: 5");
        LogoutButton.setPrefWidth(70);
        LogoutButton.setPrefHeight(25);
        LogoutButton.setAlignment(Pos.BOTTOM_RIGHT);
        LogoutButton.setOnAction(event -> {                 // Take user back to login page view
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });


        // Set left section
        VBox PhysicalExamSection = new VBox(PhysicalExam, VitalSigns, VSTextField, VisionAcuity, VATextField, CardiovascularHealth, CHTextField, RespiratoryHealth,
                RHTextField, NeuroHealth, NHTextField, MusculoskeletalAssessment, MATextField, SkinAndLymphNodes, SLNTextField, Diagnosis, DiagTextField, submitButton);
        PhysicalExamSection.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY))); // Setting background color
        PhysicalExamSection.setPadding(new Insets(20, 20, 20, 20));
        PhysicalExamSection.setAlignment(Pos.CENTER_LEFT);



        // Set right section
        VBox PrescribeMedicationSection = new VBox(PrescribeMedication, Medication, MedTextField, Pharmacy, PharTextField, Notes, NoteTextField, SendPreButton);
        PrescribeMedicationSection.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY))); // Setting background color
        PrescribeMedicationSection.setPadding(new Insets(20, 20, 20, 20));
        PrescribeMedicationSection.setAlignment(Pos.CENTER_LEFT);


        // Set the general position of each section
        BorderPane layout = new BorderPane();
        layout.setTop(titleLabel);
        layout.setCenter(PhysicalExamSection);
        layout.setRight(PrescribeMedicationSection);






/*
        submitButton.setOnAction(e -> {

            // Retrieves the text entered
            String VSText = VSTextField.getText();
            String VAText = VATextField.getText();
            String CHText = CHTextField.getText();
            String RHText = RHTextField.getText();
            String NHText = NHTextField.getText();
            String MAText = MATextField.getText();
            String SLNText = SLNTextField.getText();
            String DiagText = DiagTextField.getText();

            // Check if all the required text fields are filled, patient record file will not save if there is more than 1 text fields(info) missing
            if (VSText.isEmpty() || VAText.isEmpty() || CHText.isEmpty() || RHText.isEmpty() || NHText.isEmpty() || MAText.isEmpty() || SLNText.isEmpty() || DiagText.isEmpty()) {

                // Display error message if there is missing text filled
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Submit Error");                                           // Display string Error as alert title
                errorAlert.setHeaderText("Missing Information!");                              // Display Missing Information as alert header
                errorAlert.setContentText("Please fill in all the required text field!");      // Display message on the alert content
                errorAlert.showAndWait();
                return;
            }

            /*
            else{

                // Create patient information FILE based on the intake form
                Patient newPatient = new Patient(patientID, firstNameText, lastNameText, emailText, phoneNumberText, healthHistoryText, insuranceIDText, examDate);

                // Save patient information to a file
                savePatientInfoToFile(newPatient);

                // Display success message after save button is clicked
                Alert intakeAlert = new Alert(Alert.AlertType.INFORMATION);
                intakeAlert.setTitle("Patient Intake");
                intakeAlert.setHeaderText("Saved successfully!");
                intakeAlert.setContentText("Patient Name: " + firstNameText + " " + lastNameText + "\nPatient ID: " + patientID +
                        "\nExam Date: " + examDate.format(dateFormatter) + "\nContact Number: " + phoneNumberText);
                intakeAlert.showAndWait();


                // Clear the input fields after patient info saved
                firstNameTextField.clear();                                               // Clear first name text field
                lastNameTextField.clear();                                                // Clear last name text field
                emailTextField.clear();                                                   // Clear email text field
                phoneNumberTextField.clear();                                             // Clear phone number text field
                healthHistoryTextField.clear();                                           // Clear health history text field
                insuranceIDTextField.clear();                                             // Clear insurance ID text field

            }



        });
*/

      return layout;

    }


}