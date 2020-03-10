package com.banton.techstore.user_interface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class forgotPasswordController {

    @FXML AnchorPane forgotPasswordPane;

    public void backToLogin(){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Stage primaryStage = (Stage) forgotPasswordPane.getScene().getWindow();
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
