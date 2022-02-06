package edu.uqtr.exercicessemaine4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DarkThemeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DarkThemeApplication.class.getResource("formulaire-dark-theme.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 340, 400);
        stage.setTitle("Dark Theme !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}