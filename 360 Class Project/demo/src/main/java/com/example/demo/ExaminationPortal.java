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

public class ExaminationPortal {
    private Stage stage;

    public ExaminationPortal(Stage stage) {
        this.stage = stage; // ExaminationPage constructor
    }

    public void show() {
        VBox layout = createLayout();
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Examination Portal");         // Set the title of the stage
        stage.show();
        layout.requestFocus();
        layout.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY)));

    }

    private VBox createLayout() {

        // Set Title for the examination layout
        Label titleLabel = new Label("Healfy Examination");
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

        Label PatientID = new Label("Patient ID: ");
        PatientID.setTextFill(Color.web("#9741A5"));
        TextField IDTextField = new TextField();
        IDTextField.setPrefWidth(225);
        IDTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label VitalSigns = new Label("Vital Signs: ");
        VitalSigns.setTextFill(Color.web("#9741A5"));
        TextField VSTextField = new TextField();
        VSTextField.setPrefWidth(225);
        VSTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label VisionAcuity = new Label("Vision Acuity: ");
        VisionAcuity.setTextFill(Color.web("#9741A5"));
        TextField VATextField = new TextField();
        VATextField.setPrefWidth(225);
        VATextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label CardiovascularHealth = new Label("Cardiovascular Health: ");
        CardiovascularHealth.setTextFill(Color.web("#9741A5"));
        TextField CHTextField = new TextField();
        CHTextField.setPrefWidth(225);
        CHTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label RespiratoryHealth = new Label("Respiratory Health: ");
        RespiratoryHealth.setTextFill(Color.web("#9741A5"));
        TextField RHTextField = new TextField();
        RHTextField.setPrefWidth(225);
        RHTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label NeuroHealth = new Label("Neuro Health: ");
        NeuroHealth.setTextFill(Color.web("#9741A5"));
        TextField NHTextField = new TextField();
        NHTextField.setPrefWidth(225);
        NHTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label MusculoskeletalAssessment = new Label("Musculoskeletal Assessment: ");
        MusculoskeletalAssessment.setTextFill(Color.web("#9741A5"));
        TextField MATextField = new TextField();
        MATextField.setPrefWidth(225);
        MATextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label SkinAndLymphNodes = new Label("Skin and Lymph Nodes: ");
        SkinAndLymphNodes.setTextFill(Color.web("#9741A5"));
        TextField SLNTextField = new TextField();
        SLNTextField.setPrefWidth(225);
        SLNTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label Diagnosis = new Label("Diagnosis: ");
        Diagnosis.setTextFill(Color.web("#9741A5"));
        TextField DiagTextField = new TextField();
        DiagTextField.setPrefWidth(225);
        DiagTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label PrescribeMedication = new Label("Prescribe Medication: ");
        PrescribeMedication.setFont(Font.font("Arial", FontWeight.BLACK, 18));
        PrescribeMedication.setTextFill(Color.web("#9741A5"));
        PrescribeMedication.setPadding(new Insets(10));

        Label PatientName = new Label("Patient Name: ");
        PatientName.setTextFill(Color.web("#9741A5"));
        TextField PNTextField = new TextField();
        PNTextField.setMaxWidth(225);
        PNTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label Medication = new Label("Medication: ");
        Medication.setTextFill(Color.web("#9741A5"));
        TextField MedTextField = new TextField();
        MedTextField.setMaxWidth(225);
        MedTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label PharmacyName = new Label("Pharmacy Name: ");
        PharmacyName.setTextFill(Color.web("#9741A5"));
        TextField PharNameTextField = new TextField();
        PharNameTextField.setPrefWidth(225);
        PharNameTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label PharmacyLocation = new Label("Pharmacy Location: ");
        PharmacyLocation.setTextFill(Color.web("#9741A5"));
        TextField PharLocTextField = new TextField();
        PharLocTextField.setPrefWidth(225);
        PharLocTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label PharmacyPhone = new Label("Pharmacy Phone Number: ");
        PharmacyPhone.setTextFill(Color.web("#9741A5"));
        TextField PharPhoneTextField = new TextField();
        PharPhoneTextField.setPrefWidth(225);
        PharPhoneTextField.setBackground(new Background(new BackgroundFill(Color.web("#ECECEC"), new CornerRadii(10.0), Insets.EMPTY)));

        Label Notes = new Label("Notes: ");
        Notes.setTextFill(Color.web("#9741A5"));
        TextArea NoteTextArea = new TextArea();
        NoteTextArea.setPrefWidth(200);
        NoteTextArea.setPrefHeight(120);
        NoteTextArea.setWrapText(true);
        NoteTextArea.setStyle("-fx-control-inner-background: #ECECEC; -fx-background-radius: 10px;");

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        submitButton.setPrefWidth(70);
        submitButton.setPrefHeight(25);
        submitButton.setOnAction(e -> {

            // Retrieves the text entered
            String IDText = IDTextField.getText();
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
                errorAlert.setHeaderText("Required Information Missing");                      // Display alert header
                errorAlert.setContentText("Please ensure all required text fields are filled. " +
                        "If no exam data is available, enter 'None'.");    // Display content alert
                errorAlert.showAndWait();
            } else {


                Patient newPatientRecord = new Patient(IDText, VSText, VAText, CHText, RHText, NHText, MAText, SLNText, DiagText);

                //savePrescriptionInfoToFile(newPrescription);
                savePatientInfoToFile(newPatientRecord);



                // Display success message after save button is clicked
                Alert intakeAlert = new Alert(Alert.AlertType.INFORMATION);
                intakeAlert.setTitle("Success");
                intakeAlert.setHeaderText("Patient ID: " + IDText);
                intakeAlert.setContentText("The data has been saved successfully");
                intakeAlert.showAndWait();

                // Clear the input fields after submit successfully
                IDTextField.clear();
                VSTextField.clear();
                VATextField.clear();
                CHTextField.clear();
                RHTextField.clear();
                NHTextField.clear();
                MATextField.clear();
                SLNTextField.clear();
                DiagTextField.clear();

            }

        });


        // Send Prescription Button
        Button SendPreButton = new Button("Send Prescription");
        SendPreButton.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        SendPreButton.setPrefWidth(120);
        SendPreButton.setPrefHeight(30);
        SendPreButton.setAlignment(Pos.CENTER);
        SendPreButton.setOnAction(e -> {

            // Retrieves the text entered
            String IDText = IDTextField.getText();
            String PatientNameText = PNTextField.getText();
            String MedicationText = MedTextField.getText();
            String PharNameText = PharNameTextField.getText();
            String PharLocText = PharLocTextField.getText();
            String PharPhoneText = PharPhoneTextField.getText();
            String NoteText = NoteTextArea.getText();


            // Check if all the required text fields are filled, patient record file will not save if there is more than 1 text fields(info) missing
            if (PatientNameText.isEmpty() || MedicationText.isEmpty() || PharNameText.isEmpty() || PharLocText.isEmpty() || PharPhoneText.isEmpty() || NoteText.isEmpty()) {


                // Display error message if there is missing text filled
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Send Error");                                             // Display string Error as alert title
                errorAlert.setHeaderText("Required Information Missing");                      // Display  alert header
                errorAlert.setContentText("Please ensure all required text fields are filled. " +
                        "If no data is available, enter 'None'.");           // Display content alert
                errorAlert.showAndWait();
            } else {

                // Create patient information FILE
                Prescription newPrescription = new Prescription(PatientNameText, MedicationText, PharNameText, PharLocText, PharPhoneText, NoteText);

                //savePrescriptionInfoToFile(newPrescription);
                savePrescriptionInfoToFile(newPrescription);

                // Display success message after save button is clicked
                Alert intakeAlert = new Alert(Alert.AlertType.INFORMATION);
                intakeAlert.setTitle("Success");
                intakeAlert.setHeaderText("Patient Name:" + PatientNameText);
                intakeAlert.setContentText("The prescription has been sent successfully");
                intakeAlert.showAndWait();

                // Clear the input fields after submit successfully
                IDTextField.clear();
                PNTextField.clear();
                MedTextField.clear();
                PharNameTextField.clear();
                NoteTextArea.clear();
                PharLocTextField.clear();
                PharPhoneTextField.clear();
            }

        });


        // Back to main view (Log out button)
        Button backButton = new Button("Leave");      // Create Log Out button
        backButton.setStyle("-fx-background-color: #FFA500; -fx-background-radius: 5");
        backButton.setPrefWidth(70);
        backButton.setPrefHeight(25);
        backButton.setAlignment(Pos.CENTER);
        backButton.setOnAction(event -> {                 // Take user back to login page view
            StaffPortal staffPortal = new StaffPortal(stage);
            staffPortal.show();
        });


        // Set left section
        VBox PhysicalExamSection = new VBox(1, PhysicalExam, PatientID, IDTextField, VitalSigns, VSTextField, VisionAcuity, VATextField, CardiovascularHealth, CHTextField, RespiratoryHealth,
                RHTextField, NeuroHealth, NHTextField, MusculoskeletalAssessment, MATextField, SkinAndLymphNodes, SLNTextField, Diagnosis, DiagTextField, submitButton);
        PhysicalExamSection.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY))); // Setting background color
        PhysicalExamSection.setPadding(new Insets(20, 20, 20, 20));
        PhysicalExamSection.setAlignment(Pos.CENTER_LEFT);


        // Set right section
        VBox PrescribeMedicationSection = new VBox(1, PrescribeMedication, PatientName, PNTextField, Medication, MedTextField, PharmacyName, PharNameTextField,
                PharmacyLocation, PharLocTextField, PharmacyPhone, PharPhoneTextField, Notes, NoteTextArea, SendPreButton);
        PrescribeMedicationSection.setBackground(new Background(new BackgroundFill(Color.web("#FFFFFE"), CornerRadii.EMPTY, Insets.EMPTY))); // Setting background color
        PrescribeMedicationSection.setPadding(new Insets(20, 20, 20, 20));
        PrescribeMedicationSection.setAlignment(Pos.CENTER_LEFT);


        HBox Hlayout = new HBox();
        Hlayout.setSpacing(80);
        Hlayout.getChildren().addAll(PhysicalExamSection, PrescribeMedicationSection);
        Hlayout.setAlignment(Pos.CENTER);

        HBox LogoutButtonLayout = new HBox();
        LogoutButtonLayout.getChildren().addAll(backButton);
        LogoutButtonLayout.setAlignment(Pos.BOTTOM_RIGHT);
        LogoutButtonLayout.setPadding(new Insets(0, 10, 10, 0));


        VBox layout = new VBox();
        layout.getChildren().addAll(titleLabel, Hlayout, LogoutButtonLayout);

        return layout;


    }

    // A private class to hold patient's information
    private class Patient {
        // private instance variables for storing the patient's info
        private String PatientID, VitalSigns , VisionAcuity , CardiovascularHealth , RespiratoryHealth,
                NeuroHealth , MusculoskeletalAssessment, SkinAndLymphNodes, Diagnosis;

        // constructor of the Patient class takes the necessary information to create a Patient object and initializes the instance variables with the provided values
        public Patient (String PatientID, String VitalSigns, String VisionAcuity, String CardiovascularHealth, String RespiratoryHealth, String NeuroHealth,
                        String MusculoskeletalAssessment, String SkinAndLymphNodes, String Diagnosis) {
            this.PatientID = PatientID;
            this.VitalSigns =  VitalSigns;
            this.VisionAcuity = VisionAcuity;
            this.CardiovascularHealth = CardiovascularHealth;
            this.RespiratoryHealth = RespiratoryHealth;
            this.NeuroHealth = NeuroHealth;
            this.MusculoskeletalAssessment = MusculoskeletalAssessment;
            this.SkinAndLymphNodes = SkinAndLymphNodes;
            this.Diagnosis = Diagnosis;

        }

        public String getPatientID() {                                                        // getter method that returns the patient's ID
            return PatientID;
        }
        public String getVitalSigns() {                                                        // getter method that returns the patient's first name
            return VitalSigns;
        }
        public String getVisionAcuity() {                                                         // getter method that returns the patient's last name
            return VisionAcuity;
        }
        public String getCardiovascularHealth() {                                                            // getter method that returns the patient's email
            return CardiovascularHealth;
        }
        public String getRespiratoryHealth() {                                                      // getter method that returns the patient's phone number
            return RespiratoryHealth;
        }
        public String getNeuroHealth() {                                                    // getter method that returns the patient's health history
            return NeuroHealth;
        }
        public String getMusculoskeletalAssessment() {                                                      // getter method that returns the patient's insurance ID
            return MusculoskeletalAssessment;
        }
        public String getSkinAndLymphNodes() {                                                         // getter method that returns the patient's exam date
            return SkinAndLymphNodes;
        }
        public String getDiagnosis() {                                                      // getter method that returns the patient's insurance ID
            return Diagnosis;
        }



    }

    // Class to hold Prescription info
    private class Prescription {
        // private instance variables for storing the patient's info
        private String  PatientName, Medication, PharmacyName, PharmacyLocation, PharmacyPhoneNumber, Note;
        // constructor of the Patient class takes the necessary information to create a Patient object and initializes the instance variables with the provided values
        public Prescription (String PatientName, String Medication, String PharmacyName, String PharmacyLocation, String PharmacyPhoneNumber, String Note) {

            this.PatientName = PatientName;
            this.Medication = Medication;
            this.PharmacyName = PharmacyName;
            this.PharmacyLocation = PharmacyLocation;
            this.PharmacyPhoneNumber = PharmacyPhoneNumber;
            this.Note = Note;
        }
        public String getPatientName() {                                                      // getter method that returns the patient's insurance ID
            return PatientName;
        }
        public String getMedication() {                                                      // getter method that returns the patient's insurance ID
            return Medication;
        }
        public String getPharmacyName() {                                                      // getter method that returns the patient's insurance ID
            return PharmacyName;
        }
        public String getPharmacyLocation() {                                                      // getter method that returns the patient's insurance ID
            return PharmacyLocation;
        }
        public String getPharmacyPhoneNumber() {                                                      // getter method that returns the patient's insurance ID
            return PharmacyPhoneNumber;
        }
        public String getNote() {                                                      // getter method that returns the patient's insurance ID
            return Note;
        }

    }

    private void savePatientInfoToFile(Patient newPatient) {
        String patientFileName = newPatient.getPatientID() + "_PatientExamData.txt";        // Create a patient file named xxxxx_PatientExamData.txt

        try (FileWriter fileWriter = new FileWriter(patientFileName)) {                    // Open try block and used for exception handling and ensures fileWriter resource is used properly

            fileWriter.write("Patient ID: " + newPatient.getPatientID());
            fileWriter.write("\nVital Signs: " + newPatient.getVitalSigns());
            fileWriter.write("\nVision Acuity: " + newPatient.getVisionAcuity());
            fileWriter.write("\nCardiovascular Health: " + newPatient.getCardiovascularHealth());
            fileWriter.write("\nRespiratory Health,: " + newPatient.getRespiratoryHealth());
            fileWriter.write("\nNeuro Health, : " + newPatient.getNeuroHealth());
            fileWriter.write("\nMusculoskeletal Assessment: " + newPatient.getMusculoskeletalAssessment());
            fileWriter.write("\nSkin And Lymph Nodes: " + newPatient.getSkinAndLymphNodes());
            fileWriter.write("\nDiagnosis: " + newPatient.getDiagnosis());

        } catch (IOException event) {       // This line starts a catch block and specifies that if an IOException occurs within the try block, the following code will handle the exception
            event.printStackTrace();        // prints the stack trace of the exception that occurred, providing information about where and how the exception was thrown
        }
    }

    private void savePrescriptionInfoToFile(Prescription newPrescription) {
        String prescriptionFileName = newPrescription.getPatientName() + "_Medication.txt";      // Create a patient file named Name_Medication.txt

        try (FileWriter fileWriter = new FileWriter(prescriptionFileName)) {                    // Open try block and used for exception handling and ensures fileWriter resource is used properly

            fileWriter.write("Patient Name: " + newPrescription.getPatientName());
            fileWriter.write("\nMedication: " + newPrescription.getMedication());
            fileWriter.write("\nPharmacy Name: " + newPrescription.getPharmacyName());
            fileWriter.write("\nPharmacy Location: " + newPrescription.getPharmacyLocation());
            fileWriter.write("\nPharmacy Phone Number: " + newPrescription.getPharmacyPhoneNumber());
            fileWriter.write("\nNotes: " + newPrescription.getNote());

        } catch (IOException event) {       // This line starts a catch block and specifies that if an IOException occurs within the try block, the following code will handle the exception
            event.printStackTrace();        // prints the stack trace of the exception that occurred, providing information about where and how the exception was thrown
        }
    }

}