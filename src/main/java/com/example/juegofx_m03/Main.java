package com.example.juegofx_m03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start (Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Parent route = fxmlLoader.load();
        stage.setTitle("Juego");
        stage.setScene(new Scene(route));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}