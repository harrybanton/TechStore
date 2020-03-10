package com.banton.user_interface;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {

    @FXML TextField txtUsername;
    @FXML PasswordField txtPassword;
    @FXML AnchorPane loginPane;
    @FXML ImageView buttonLogin;

    //Login - check credentials & move to homepage
    public void loginUser(){

        //boolean isAdmin = true;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Stage primaryStage = (Stage) loginPane.getScene().getWindow();
            primaryStage.setTitle("Homepage");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //handle when user clicks "enter" key within password field
    public void handleEnterKey(KeyEvent keyEvent){
        if(keyEvent.getCode() == KeyCode.ENTER)
        {
            loginUser();
        }
    }

    //forgot password screen
    public void forgotPassword(){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("forgotPword.fxml"));
            Stage primaryStage = (Stage) loginPane.getScene().getWindow();
            primaryStage.setTitle("Forgot My Password");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    //register screen
    public void registerAccount(){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("forgotPword.fxml"));
            Stage primaryStage = (Stage) loginPane.getScene().getWindow();
            primaryStage.setTitle("Register");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }


}
