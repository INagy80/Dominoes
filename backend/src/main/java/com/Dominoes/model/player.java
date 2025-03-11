package com.Dominoes.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
public class player {
    @Id
    @SequenceGenerator(
            name = "player_id_sequence",
            sequenceName = "player_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_id_sequence"
    )
    private int id;

    private String name;

    private int score;

    @OneToMany(cascade = CascadeType.DETACH)
    private List<tile> PlayerTiles;

    @OneToOne(cascade = CascadeType.DETACH)
    private tilePool tilePool;

    private boolean isInTeam;

    public player() {}

    public player( String name , boolean isInTeam,tilePool tilePool) {

        this.name = name;
        this.score = 0;
        this.isInTeam=isInTeam;
        this.tilePool=tilePool;
        PlayerTiles = new ArrayList<>();
        Random random = new Random();
        if(isInTeam){
           for(int i = 0; i < 7; i++) {
               PlayerTiles.add(tilePool.getTiles().remove((int)random.nextInt(tilePool.getTiles().size()-i)));
           }
        }else{
            for(int i = 0; i < 14 ; i++) {
                PlayerTiles.add(tilePool.getTiles().remove((int)random.nextInt(tilePool.getTiles().size()-i)));
            }
        }

    }

    //functions
    public tile getDominoFromHand(int index){
        return PlayerTiles.get(index);

    }

    public tile removeDominofromHand(int index){
        if(index >= 0 && index < PlayerTiles.size()){
            tile temp = getDominoFromHand(index);
            PlayerTiles.remove(index);
            return temp;
        }

        return null;
    }

    public int dominoCount(){
        return PlayerTiles.size();
    }

    public void drawDomino (){
        PlayerTiles.add(tilePool.drawDomino());
    }

    public int findDomino(int value) {
        for(int i = 0; i < PlayerTiles.size(); i++) {
            tile temp = getDominoFromHand(i);
            if(value == temp.getLeftValue() || value == temp.getRightValue())
                return i;
        }
        return -1;
    }

    public boolean hasDoubleInHand() {
        for (int i = 0; i < PlayerTiles.size(); i++) {
            tile temp = getDominoFromHand(i);
            if(temp.isDouble())
                return true;
        }
        return false;
    }

    public int findHighestDouble() {
        if(hasDoubleInHand()) return -1;

        int highest = 0;
        for(int i = 0; i < PlayerTiles.size(); i++) {
            tile temp = getDominoFromHand(i);
            if(temp.isDouble() && temp.getLeftValue() >= getDominoFromHand(highest).getLeftValue()) {
                highest = i;
            }
        }
        return highest;
    }

    public void clearHand(){
        PlayerTiles.clear();
    }

    public void clearScore(){
        score = 0 ;
    }

    public void addToScore(int plus){
        score += plus ;
    }






    //setters and getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public List<tile> getPlayerTiles() {
        return PlayerTiles;
    }

    public boolean isInTeam() {
        return isInTeam;
    }

    public tilePool getTilePool(){
        return this.tilePool;
    }
}
