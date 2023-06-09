package com.example.demo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StaffPortal {
    private Stage stage;

    public StaffPortal(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        stage.setScene(createScene());
        stage.show();
    }

    private Scene createScene() {
        BorderPane root = new BorderPane();
        Account activeAccount = AccountManager.activeAccount;

        BorderPane centerBorderPane = new BorderPane();
        centerBorderPane.setPrefHeight(420);
        centerBorderPane.setPrefWidth(600);
        root.setCenter(centerBorderPane);

        VBox centerVBox = new VBox();
        centerVBox.setAlignment(Pos.TOP_CENTER);
        centerVBox.setPrefHeight(200);
        centerVBox.setPrefWidth(100);
        centerBorderPane.setCenter(centerVBox);

        Label welcomeLabel = new Label("Welcome Back, " + activeAccount.firstName);
        welcomeLabel.setTextFill(Color.valueOf("#9741a5"));
        welcomeLabel.setFont(new Font(35));
        centerVBox.getChildren().add(welcomeLabel);

        Label recentMessageLabel = new Label("Recent Messages");
        recentMessageLabel.setTextFill(Color.web("#9741a5"));
        recentMessageLabel.setUnderline(true);
        recentMessageLabel.setFont(new Font(25));
        centerVBox.getChildren().add(recentMessageLabel);

        ListView<String> messageList = new ListView<>();
        messageList.setPrefHeight(200);
        messageList.setPrefWidth(560);
        messageList.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        VBox.setMargin(messageList, new Insets(0, 5, 5, 5));
        centerVBox.getChildren().add(messageList);

        Button messagePortalButton = new Button("Message Portal");
        messagePortalButton.setPrefWidth(165);
        messagePortalButton.setStyle("-fx-background-color: #E2CE15;");
        messagePortalButton.setFont(new Font(20));
        messagePortalButton.setOnAction(event -> {
            MessagePanel messagePortal = new MessagePanel(stage);
            messagePortal.show();
        });
        VBox.setMargin(messagePortalButton, new Insets(10,5,5,5));
        centerVBox.getChildren().add(messagePortalButton);


        /*
        Label instructionLabel = new Label("Enter Patient ID to Start Test:");
        instructionLabel.setTextFill(Color.web("#9741a5"));
        instructionLabel.setFont(new Font(20));
        centerVBox.getChildren().add(instructionLabel);

        TextField testID = new TextField();
        testID.setStyle("-fx-background-radius: 10; -fx-background-color: #ECECEC; -fx-max-width: 220");
        testID.setFont(new Font(20));
        testID.setAlignment(Pos.CENTER);
        centerVBox.getChildren().add(testID);
         */

        Button takeVitalButton = new Button("Take Vitals");
        takeVitalButton.setPrefWidth(135);
        takeVitalButton.setStyle("-fx-background-color: #E2CE15;");
        takeVitalButton.setFont(new Font(20));
        takeVitalButton.setOnAction(event -> {
            VitalsPanel vitalsPanel = new VitalsPanel(stage);
            vitalsPanel.show();
        });
        VBox.setMargin(takeVitalButton, new Insets(5));
        centerVBox.getChildren().add(takeVitalButton);

        Button examinationButton = new Button("Examination");
        examinationButton.setStyle("-fx-background-color: #E2CE15;");
        examinationButton.setFont(new Font(20));
        examinationButton.setOnAction(event -> {
            ExaminationPortal examinationPortal = new ExaminationPortal(stage);
            examinationPortal.show();
        });
        VBox.setMargin(examinationButton, new Insets(5));
        centerVBox.getChildren().add(examinationButton);

        Button logoutButton = new Button("Logout");
        logoutButton.setPrefWidth(165);
        logoutButton.setStyle("-fx-background-color: #F17C0F;");
        logoutButton.setFont(new Font(20));
        logoutButton.setOnAction(event -> {                 // Take user back to login page view
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });
        VBox.setMargin(logoutButton, new Insets(5));
        centerVBox.getChildren().add(logoutButton);

        VBox leftVBox = new VBox();
        leftVBox.setAlignment(Pos.TOP_CENTER);
        leftVBox.setPrefHeight(600);
        leftVBox.setPrefWidth(230);
        root.setLeft(leftVBox);

        Label patientIDLabel = new Label("Patient ID:");
        patientIDLabel.setTextFill(Color.web("#9741a5"));
        patientIDLabel.setFont(new Font(20));
        leftVBox.getChildren().add(patientIDLabel);

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




        Scene scene = new Scene(root, 800, 600);
        return scene;
    }
}
