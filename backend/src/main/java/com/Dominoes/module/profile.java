package com.Dominoes.module;
import java.util.ArrayList;
import java.util.List;


public class profile {

    //add some parameters
    private int gamesPlayed;
    private int gamesWon;
    private int ranking;
    private List<User> users;

    // Constructor
    public profile(int gamesPlayed, int gamesWon, int ranking, List<User> users) {
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.ranking = ranking;
        this.users = users;
    }

    // Getters and Setters
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}



