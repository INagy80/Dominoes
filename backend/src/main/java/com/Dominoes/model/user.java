package com.Dominoes.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {



    // Add some parameters
    @Id
    private Integer id;
    private String userName;
    private String email;
    private String passwordHash;
    private boolean isGuest;

    // Constructor
    public user() {
    }

    public user(Integer id, String userName, String email, String passwordHash, boolean isGuest) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.isGuest = isGuest;
    }



    // Getters and Setters


    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }
}
