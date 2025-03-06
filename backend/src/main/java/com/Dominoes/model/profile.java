package com.Dominoes.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class    profile {

    //add some parameters
    private int gamesPlayed;
    private int gamesWon;
    private int ranking;
    private String Avatar;
    private List<user> friend; // This Variable is not working @OneToMany should be added
    @Id
    private Long id;


    // Constructor
    public profile() { } // non-Para Konstruktor

    public profile(int gamesPlayed, int gamesWon, int ranking, String avatar, List<user> friend, Long id) {
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.ranking = ranking;
        Avatar = avatar;
        this.friend = friend;
        this.id = id;
    }

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

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public List<user> getFriend() {
        return friend;
    }

    public void setFriend(List<user> friend) {
        this.friend = friend;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
