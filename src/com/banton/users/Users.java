package com.banton.users;

public class Users {

    //declare variables
    private int userID;
    private String firstName;
    private String surname;
    private String username;
    private String email;
    private String password;
    private Boolean isApproved;
    private Boolean isAdmin;

    //constructor
    public Users(int intUserID, String strFirstName, String strSurname, String strUsername, String strEmail, String strPassword, Boolean boolIsApproved, Boolean boolIsAdmin){
        userID = intUserID;
        firstName = strFirstName;
        surname = strSurname;
        username = strUsername;
        email = strEmail;
        password = strPassword;
        isApproved = boolIsApproved;
        isAdmin = boolIsAdmin;
    }

    //get variables
    public String getFirstName(){
        return firstName;
    }

    public String getSurname(){
        return surname;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public Boolean getIsApproved(){
        return isApproved;
    }

    public Boolean getIsAdmin(){
        return isAdmin;
    }


    //set variables
    public void setEmail(String newEmail){
        email = newEmail;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }

    public void setIsApproved(){
        isApproved = true;
    }

    public void setIsAdmin(){
        isAdmin = true;
    }

}
