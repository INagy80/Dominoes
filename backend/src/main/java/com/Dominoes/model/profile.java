package com.Dominoes.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;



import com.Dominoes.model.*;


@Entity
public class profile {

    //attribute

    @Id
    @SequenceGenerator(
            name = "profile_id_sequence",
            sequenceName = "profile_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "profile_id_sequence"

    )
    private Integer id;


    private String avatar;

    private int ranking ;


    // we could add these later on :

    //private List<mUser> friends;

    //private List<user> followers;

    //private List<user> following;



    private int followersCount;

    private int followingsCount;

    private int inGameCurrencies;

    @OneToOne
    private userHistory history;

    private boolean isGuest;

    private boolean isAdmin;

    private String role;

    //empty constructor are important for JPA

    public profile() {

    }

    // constructor

    public profile(String avatar, userHistory history, boolean isAdmin, String role) {

        this.avatar = avatar;
        this.ranking = 0;
        this.followersCount = 0;
        this.followingsCount = 0;
        this.inGameCurrencies = 1000;
        this.history = history;
        this.isGuest = false;
        this.isAdmin = isAdmin;
        this.role = role;
    }


    // setters and getters

    public userHistory getHistory() {
        return history;
    }


    public void setHistory(userHistory history) {
        this.history = history;
    }
    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFollowingsCount() {
        return followingsCount;
    }

    public void setFollowingsCount(int followingsCount) {
        this.followingsCount = followingsCount;
    }

    public int getInGameCurrencies() {
        return inGameCurrencies;
    }

    public void setInGameCurrencies(int inGameCurrencies) {
        this.inGameCurrencies = inGameCurrencies;
    }




    @Override
    public int hashCode() {
        return Objects.hash(avatar, ranking, followersCount, followingsCount, inGameCurrencies);
    }

    //toString

    @Override
    public String toString() {
        return "profile{" +
                "avatar='" + avatar + '\'' +
                ", ranking=" + ranking +


                ", followersCount=" + followersCount +
                ", followingsCount=" + followingsCount +
                ", inGameCurrencies=" + inGameCurrencies +

                '}';
    }
}
