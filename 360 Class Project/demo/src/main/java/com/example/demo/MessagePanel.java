package com.example.demo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MessagePanel {
    private Stage stage;

    public MessagePanel(Stage stage)
    {
        this.stage = stage; // CreateAccountPage constructor
    }

    public void show() {
        stage.setScene(createScene());
        stage.show();
    }

    private Scene createScene()
    {
        BorderPane root = new BorderPane();
        root.setPrefSize(800, 600);

        HBox centerHBox = new HBox();
        centerHBox.setAlignment(Pos.TOP_CENTER);
        centerHBox.setPrefHeight(100);
        centerHBox.setPrefWidth(200);
        root.setCenter(centerHBox);

        VBox leftVBox = new VBox();
        leftVBox.setAlignment(Pos.TOP_CENTER);
        leftVBox.setPrefHeight(200);
        leftVBox.setPrefWidth(400);
        centerHBox.getChildren().add(leftVBox);

        Label label1 = new Label("Messages");
        label1.setTextFill(Color.web("#9741a5"));
        label1.setFont(new Font(25));
        label1.setUnderline(true);
        leftVBox.getChildren().add(label1);

        ListView<String> listView = new ListView<>();
        listView.setPrefHeight(548);
        listView.setPrefWidth(390);
        listView.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        VBox.setMargin(listView, new Insets(10));
        leftVBox.getChildren().add(listView);

        VBox rightVBox = new VBox();
        rightVBox.setAlignment(Pos.TOP_CENTER);
        rightVBox.setPrefHeight(200);
        rightVBox.setPrefWidth(400);
        centerHBox.getChildren().add(rightVBox);

        StackPane stackPane = new StackPane();
        stackPane.setAlignment(Pos.TOP_RIGHT);
        stackPane.setPrefHeight(0);
        stackPane.setPrefWidth(400);
        rightVBox.getChildren().add(stackPane);

        Button closeButton = new Button("X");
       // closeButton.setStyle("-fx-background-radius: 15;");
        closeButton.setFont(new Font(15));
        StackPane.setMargin(closeButton, new Insets(5));
        stackPane.getChildren().add(closeButton);
        closeButton.setOnAction(e -> {
            Account activeAccount = AccountManager.activeAccount;

            if(activeAccount.isStaff){
                StaffPortal staffPortal = new StaffPortal(stage);
                staffPortal.show();
            }else{
                PatientPortal patientPortal = new PatientPortal(stage);
                patientPortal.show();
            }
        });

        Label label2 = new Label("New Message");
        label2.setTextFill(Color.web("#9741a5"));
        label2.setFont(new Font(25));
        label2.setUnderline(true);
        rightVBox.getChildren().add(label2);

        HBox recipientHBox = new HBox();
        recipientHBox.setAlignment(Pos.CENTER_LEFT);
        recipientHBox.setPrefHeight(0);
        recipientHBox.setPrefWidth(400);
        rightVBox.getChildren().add(recipientHBox);

        Label recipientLabel = new Label("Recipient:");
        recipientLabel.setTextFill(Color.web("#9741a5"));
        recipientLabel.setFont(new Font(20));
        recipientLabel.setPrefWidth(100);
        recipientHBox.getChildren().add(recipientLabel);

        TextField recipientTextField = new TextField();
        recipientTextField.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        recipientTextField.setPrefHeight(25);
        recipientTextField.setPrefWidth(200);
        HBox.setMargin(recipientTextField, new Insets(5));
        recipientHBox.getChildren().add(recipientTextField);

        HBox subjectHBox = new HBox();
        subjectHBox.setAlignment(Pos.CENTER_LEFT);
        subjectHBox.setPrefHeight(0);
        subjectHBox.setPrefWidth(400);
        rightVBox.getChildren().add(subjectHBox);

        Label subjectLabel = new Label("Subject:   ");
        subjectLabel.setTextFill(Color.web("#9741a5"));
        subjectLabel.setFont(new Font(20));
        subjectLabel.setPrefWidth(100);
        subjectHBox.getChildren().add(subjectLabel);

        TextField subjectTextField = new TextField();
        subjectTextField.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10;");
        subjectTextField.setPrefHeight(25);
        subjectTextField.setPrefWidth(200);
        HBox.setMargin(subjectTextField, new Insets(5));
        subjectHBox.getChildren().add(subjectTextField);

        HBox messageHBox = new HBox();
        messageHBox.setPrefHeight(228);
        messageHBox.setPrefWidth(400);
        rightVBox.getChildren().add(messageHBox);

        Label messageLabel = new Label("Message: ");
        messageLabel.setTextFill(Color.web("#9741a5"));
        messageLabel.setFont(new Font(20));
        messageLabel.setPrefWidth(100);
        messageHBox.getChildren().add(messageLabel);

        TextField messageTextField = new TextField();
        messageTextField.setStyle("-fx-background-color: #ECECEC; -fx-background-radius: 10; -fx-alignment: top_left");
        messageTextField.setPrefHeight(214);
        messageTextField.setPrefWidth(291);
        HBox.setMargin(messageTextField, new Insets(5));
        messageHBox.getChildren().add(messageTextField);

        HBox sendButtonHBox = new HBox();
        sendButtonHBox.setAlignment(Pos.TOP_RIGHT);
        sendButtonHBox.setPrefHeight(100);
        sendButtonHBox.setPrefWidth(200);
        rightVBox.getChildren().add(sendButtonHBox);

        Button sendButton = new Button("Send");
        sendButton.setStyle("-fx-background-color: #E2CE15;");
        sendButton.setFont(new Font(20));
        HBox.setMargin(sendButton, new Insets(5));
        sendButtonHBox.getChildren().add(sendButton);

        // Back to Patient portal
        Button BackButton = new Button("Logout");
        BackButton.setStyle("-fx-background-color: #FFA500; -fx-background-radius: 5");
        BackButton.setPrefWidth(140);
        BackButton.setPrefHeight(25);
        BackButton.setFont(new Font(15));
        HBox.setMargin(BackButton, new Insets(5));
        rightVBox.getChildren().add(BackButton);
        BackButton.setAlignment(Pos.CENTER);
        BackButton.setOnAction(event -> {                 // Take user back to Patient Portal
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });


        Scene scene = new Scene(root, 800, 600);
        return scene;
    }
}
