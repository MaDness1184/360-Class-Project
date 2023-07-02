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

    private Scene createScene()
    {
        BorderPane root = new BorderPane();

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

        Label patientIDLabel = new Label("Patient ID: #####");
        patientIDLabel.setTextFill(Color.web("#9741a5"));
        patientIDLabel.setUnderline(true);
        patientIDLabel.setFont(new Font(18));
        leftVBox.getChildren().add(patientIDLabel);

        Button changeInfoButton = new Button("Change Information");
        changeInfoButton.setStyle("-fx-background-color: #E2CE15;");
        changeInfoButton.setFont(new Font(20));
        leftVBox.getChildren().add(changeInfoButton);

        Button logoutButton = new Button("Logout");
        logoutButton.setPrefHeight(45);
        logoutButton.setPrefWidth(200);
        logoutButton.setStyle("-fx-background-color: #F17C0F;");
        logoutButton.setFont(new Font(20));
        VBox.setMargin(logoutButton, new Insets(5));
        leftVBox.getChildren().add(logoutButton);

        VBox bottomVBox = new VBox();
        bottomVBox.setAlignment(Pos.TOP_CENTER);
        bottomVBox.setPrefHeight(220);
        bottomVBox.setPrefWidth(800);
        root.setBottom(bottomVBox);

        Label recentVisitLabel = new Label("Recent Visits");
        recentVisitLabel.setTextFill(Color.web("#9741a5"));
        recentVisitLabel.setUnderline(true);
        recentVisitLabel.setFont(new Font(20));
        bottomVBox.getChildren().add(recentVisitLabel);

        ListView<String> recentVisitList = new ListView<>();
        recentVisitList.setPrefHeight(185);
        recentVisitList.setPrefWidth(785);
        recentVisitList.setStyle("-fx-background-color: #D9D9D9; -fx-background-radius: 10;");
        bottomVBox.getChildren().add(recentVisitList);

        BorderPane centerBorderPane = new BorderPane();
        centerBorderPane.setPrefHeight(420);
        centerBorderPane.setPrefWidth(600);
        root.setCenter(centerBorderPane);

        VBox centerVBox = new VBox();
        centerVBox.setAlignment(Pos.TOP_CENTER);
        centerVBox.setPrefHeight(200);
        centerVBox.setPrefWidth(100);
        centerBorderPane.setCenter(centerVBox);

        Label welcomeLabel = new Label("Welcome Back, <Insert Name>");
        welcomeLabel.setTextFill(Color.web("#9741a5"));
        welcomeLabel.setFont(new Font(30));
        centerVBox.getChildren().add(welcomeLabel);

        Label recentMessagesLabel = new Label("Recent Messages");
        recentMessagesLabel.setTextFill(Color.web("#9741a5"));
        recentMessagesLabel.setUnderline(true);
        recentMessagesLabel.setFont(new Font(20));
        centerVBox.getChildren().add(recentMessagesLabel);

        ListView<String> messagesList = new ListView<>();
        messagesList.setPrefHeight(280);
        messagesList.setPrefWidth(650);
        messagesList.setStyle("-fx-background-color: #D9D9D9; -fx-background-radius: 10;");
        centerVBox.getChildren().add(messagesList);

        Button messageButton = new Button("Message Portal");
        messageButton.setStyle("-fx-background-color: #E2CE15;");
        messageButton.setFont(new Font(20));
        VBox.setMargin(messageButton, new Insets(5));
        centerVBox.getChildren().add(messageButton);

        Scene scene = new Scene(root, 800, 600);
        return scene;
    }
}
