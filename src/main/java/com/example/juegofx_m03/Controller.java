package com.example.juegofx_m03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    Stage stage;
    Juego juego;

    public void onStartButtonClick() throws Exception {
        stage = new Stage();
        juego = new Juego();
    juego.start(stage);

    }
}