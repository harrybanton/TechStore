package com.banton.users;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "techstore", catalog = "")
public class Users {
    private int userId;
    private String firstname;
    private String surname;
    private String username;
    private String password;
    private String email;
    private byte isAdmin;
    private byte isApproved;

    @Id
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "Username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "isAdmin")
    public byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Basic
    @Column(name = "isApproved")
    public byte getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(byte isApproved) {
        this.isApproved = isApproved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users that = (Users) o;
        return userId == that.userId &&
                isAdmin == that.isAdmin &&
                isApproved == that.isApproved &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstname, surname, username, password, email, isAdmin, isApproved);
    }
}
