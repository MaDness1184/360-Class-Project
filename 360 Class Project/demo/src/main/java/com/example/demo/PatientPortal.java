package com.example.demo;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PatientPortal
{
    private Stage stage;

    public PatientPortal(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        VBox layout = createLayout();
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        layout.requestFocus();
        stage.show();
    }

    private VBox createLayout()
    {
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        Label patientLabel = new Label("Patient Portal");

        // Temporary back button that takes you to Login Page
        Button back = new Button("Temporary Back Button");
        back.setStyle("-fx-background-color: #E2CE15; -fx-background-radius: 5");
        back.setMinWidth(100);
        back.setOnAction(e -> {
            LoginPage loginPage = new LoginPage(stage);
            loginPage.show();
        });

        layout.getChildren().addAll(back, patientLabel);
        return layout;
    }
}
