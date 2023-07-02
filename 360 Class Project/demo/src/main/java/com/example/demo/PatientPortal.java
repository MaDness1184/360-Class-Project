package com.example.demo;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
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
        Pane root = new Pane();

        ListView<String> listView1 = new ListView<>();
        listView1.setLayoutX(226.0);
        listView1.setLayoutY(120.0);
        listView1.setPrefHeight(218.0);
        listView1.setPrefWidth(550.0);
        listView1.setStyle("-fx-background-color: D9D9D9; -fx-background-radius: 10;");
        root.getChildren().add(listView1);

        Label label1 = new Label("Welcome Back, <Insert name>");
        label1.setAlignment(Pos.TOP_CENTER);
        label1.setContentDisplay(ContentDisplay.TOP);
        label1.setLayoutX(222.0);
        label1.setLayoutY(12.0);
        label1.setPrefHeight(84.0);
        label1.setPrefWidth(567.0);
        label1.setTextFill(Paint.valueOf("#9541a3"));
        label1.setTextOverrun(OverrunStyle.CLIP);
        label1.setFont(new Font(25.0));
        root.getChildren().add(label1);

        Label label2 = new Label("Recent Messages");
        label2.setLayoutX(451.0);
        label2.setLayoutY(97.0);
        label2.setTextFill(Paint.valueOf("#9741a5"));
        label2.setFont(new Font(15.0));
        root.getChildren().add(label2);

        ImageView imageView1 = new ImageView();
        imageView1.setFitHeight(181.0);
        imageView1.setFitWidth(187.0);
        imageView1.setLayoutX(14.0);
        imageView1.setLayoutY(9.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        Image image1 = new Image("Healfy-Logo.png");
        imageView1.setImage(image1);
        root.getChildren().add(imageView1);

        Label label3 = new Label("Patient ID: #####");
        label3.setAlignment(Pos.TOP_CENTER);
        label3.setLayoutX(11.0);
        label3.setLayoutY(230.0);
        label3.setPrefHeight(21.0);
        label3.setPrefWidth(167.0);
        label3.setTextFill(Paint.valueOf("#9741a5"));
        label3.setUnderline(true);
        label3.setFont(new Font(15.0));
        root.getChildren().add(label3);

        Button button1 = new Button("Change Information");
        button1.setAlignment(Pos.TOP_CENTER);
        button1.setLayoutX(17.0);
        button1.setLayoutY(253.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(1.0);
        button1.setPrefWidth(160.0);
        button1.setStyle("-fx-background-color: E2CE15;");
        button1.setTextAlignment(TextAlignment.CENTER);
        button1.setWrapText(true);
        button1.setFont(new Font(15.0));
        root.getChildren().add(button1);

        Button button2 = new Button("Logout");
        button2.setLayoutX(17.0);
        button2.setLayoutY(289.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(0.0);
        button2.setPrefWidth(160.0);
        button2.setStyle("-fx-background-color: F17C0F;");
        button2.setFont(new Font(15.0));
        root.getChildren().add(button2);

        ListView<String> listView2 = new ListView<>();
        listView2.setLayoutX(7.0);
        listView2.setLayoutY(409.0);
        listView2.setPrefHeight(140);
        listView2.setPrefWidth(770);
        listView2.setStyle("-fx-background-color: D9D9D9; -fx-background-radius: 10;");
        root.getChildren().add(listView2);

        Label label4 = new Label("Recent Visits");
        label4.setLayoutX(350.0);
        label4.setLayoutY(386.0);
        label4.setPrefHeight(0.0);
        label4.setPrefWidth(84.0);
        label4.setTextFill(Paint.valueOf("#9741a5"));
        label4.setFont(new Font(15.0));
        root.getChildren().add(label4);

        Button button3 = new Button("Messages");
        button3.setLayoutX(471.0);
        button3.setLayoutY(341.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0);
        button3.setPrefWidth(86.0);
        button3.setStyle("-fx-background-color: E2CE15;");
        button3.setFont(new Font(15.0));
        root.getChildren().add(button3);

        Scene scene = new Scene(root, 800, 600);
        return scene;
    }
}
