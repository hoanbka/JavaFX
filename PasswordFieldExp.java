package com.jenkov.javafx.helloworld;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PasswordFieldExp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Password Area");

        Button button = new Button("Click");
        PasswordField passwordField= new PasswordField();
        TextField outputTextField = new TextField();

        HBox hBox = new HBox(button, passwordField, outputTextField);
        Scene scene = new Scene(hBox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                outputTextField.setText(passwordField.getText());
            }
        });


    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
