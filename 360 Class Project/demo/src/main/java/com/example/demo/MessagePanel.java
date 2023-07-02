package com.example.demo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MessagePanel {
    private Stage stage;

    public MessagePanel(Stage stage)
    {
        this.stage = stage; // CreateAccountPage constructor
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
        Label patientLabel = new Label("Messages");

        return layout;
    }
}
