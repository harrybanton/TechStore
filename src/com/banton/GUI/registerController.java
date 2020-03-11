package com.banton.GUI;

import com.banton.users.Users;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class registerController {

    @FXML AnchorPane forgotPasswordPane;
    @FXML TextField txtFirstname;
    @FXML TextField txtSurname;
    @FXML TextField txtUsername;
    @FXML TextField txtEmail;
    @FXML PasswordField txtPassword;
    @FXML PasswordField txtPasswordConfirm;


    public void backToLogin(){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage primaryStage = (Stage) forgotPasswordPane.getScene().getWindow();
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void register(){
        System.out.println(txtFirstname.getText());



    }
}
