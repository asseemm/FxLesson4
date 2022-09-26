package com.example.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class registration extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(registration.class.getResource("registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 700 );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


}
