package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML

    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("Clicked...........");
    }

}