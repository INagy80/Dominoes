package com.Dominoes.model;
import java.util.List;


public class profile {

    //add some parameters
    private int gamesPlayed;
    private int gamesWon;
    private int ranking;


    // Constructor
    public profile(int gamesPlayed, int gamesWon, int ranking) {
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.ranking = ranking;

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


}



