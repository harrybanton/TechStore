package com.banton.user_interface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class homepageController {

    @FXML AnchorPane homepagePane;

    //user clicks logout button
    public void logout(){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage primaryStage = (Stage) homepagePane.getScene().getWindow();
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }



}
