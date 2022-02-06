package edu.uqtr.exercicessemaine4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DarkThemeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}