package com.jenkov.javafx.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextFieldExperiments extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello Dr Hoan");

        TextField textField = new TextField();
        Button button = new Button("Click");
        HBox hBox = new HBox(button, textField);

        Scene scene = new Scene(hBox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText("clicked");
            }
        });

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}