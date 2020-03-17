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
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.jpa.HibernateQuery;
import org.hibernate.procedure.internal.Util;


import java.io.IOException;

public class registerController {

    @FXML AnchorPane forgotPasswordPane;
    @FXML TextField txtFirstname;
    @FXML TextField txtSurname;
    @FXML TextField txtUsername;
    @FXML TextField txtEmail;
    @FXML PasswordField txtPassword;
    @FXML PasswordField txtConfirmPassword;


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

        Users user = new Users();
        user.setFirstname(txtFirstname.getText());
        user.setSurname(txtSurname.getText());
        user.setUsername(txtUsername.getText());
        user.setEmail(txtEmail.getText());
        user.setPassword(txtPassword.getText());
        user.setIsApproved((byte) 0);
        user.setIsAdmin((byte) 0);

        System.out.println("Post user class");


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("After session made");

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();


        session.close();
        sessionFactory.close();



    }
}
