package com.Dominoes.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
@Entity
public class player {
    @Id
    private int idP;
    private String name;
    private int inGamePunkt;
    @OneToMany(cascade = CascadeType.DETACH)
    private List<tile> PlayerTiles;

    public player() {}

    public player(int idP, String name, int inGamePunkt) {
        this.idP = idP;
        this.name = name;
        this.inGamePunkt = inGamePunkt;
        PlayerTiles = new ArrayList<>();
        for(int i = 0; i < 7; i++) {
            PlayerTiles.add(new tile((int)Math.random(), (int)Math.random()));
        }

    }
    public int getId() {
        return idP;
    }
    public void setId(int idP) {
        this.idP = idP;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getInGamePunkt() {
        return inGamePunkt;
    }
    public void setInGamePunkt(int inGamePunkt) {
        this.inGamePunkt = inGamePunkt;
    }
    public List<tile> getPlayerTiles() {
        return PlayerTiles;
    }


}
