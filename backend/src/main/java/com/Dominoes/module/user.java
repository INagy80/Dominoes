package com.Dominoes.module;

public class user {

    // Add some parameters
    private String id;
    private String userName;
    private String email;
    private String passwordHash;
    private boolean isGuest;

    // Constructor
    public user(String id, String userName, String email, String passwordHash, boolean isGuest) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.isGuest = isGuest;
    }

    // Method to generate a random UUID for a given parameter ID
    public UUID generateRandomUUIDForID(String id) {
        // Generate a random UUID (v4) for each ID
        return UUID.randomUUID();
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
