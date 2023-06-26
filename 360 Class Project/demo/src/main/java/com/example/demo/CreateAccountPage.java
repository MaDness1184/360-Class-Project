package com.example.demo;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class CreateAccountPage
{

    private Stage stage;

    public CreateAccountPage(Stage stage)
    {
        this.stage = stage; // CreateAccountPage constructor
    }

    public void show()
    {
        VBox layout = createLayout();
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 200);
        Label createAccountLabel = new Label("Create Account");
        layout.getChildren().add(createAccountLabel);
        stage.setScene(scene);
        layout.requestFocus();
        stage.show();
    }

    private VBox createLayout()
    {
        VBox layout = new VBox(10);

        // Temporary back button that takes you to Login Page
        Button back = new Button("Temporary Back Button");
        back.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        back.setMinWidth(100);
        back.setOnAction(e -> {
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });

        layout.getChildren().addAll(back);
        return layout;
    }
}
