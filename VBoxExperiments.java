package com.jenkov.javafx.helloworld;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello Dr. Hoan");

        Button button1 = new Button("VOTED");
        Button button2 = new Button("AGAINST");

        TextField textField = new TextField();
        textField.setMaxSize(200,20);

        VBox vBox = new VBox(button1, button2, textField);
        Scene scene = new Scene(vBox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText("VOTED FOR HILLARY CLINTON");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText("VOTED FOR DONALD TRUMP");
            }
        });


    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
