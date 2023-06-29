package com.    example.demo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LoginPage loginPage = new LoginPage(stage);

        // Set preferred window size
        stage.setWidth(800);
        stage.setHeight(600);

        // Set minimum window size
        stage.setMinWidth(400);
        stage.setMinHeight(300);

        loginPage.show(); // Display initial Login Page as start for the UI
    }

    public static void main(String[] args) {
        launch();
    }
}