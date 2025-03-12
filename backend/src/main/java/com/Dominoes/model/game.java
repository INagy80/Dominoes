package com.Dominoes.model;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;

@Entity
public class game {

    @Id
    @SequenceGenerator(
            name = "game_id_sequence",
            sequenceName = "game_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "game_id_sequence"

    )
    private Integer id;

    @OneToOne
    private tilePool tilePool;

    @OneToMany
    private List<player> players ;

    private Integer gameRound ;



    public game(tilePool tilePool, List<player> players, Integer gameRound) {
        this.tilePool = tilePool;
        this.players = players;
        this.gameRound = 0;
    }
    public game() {}

    public void initGame(){
        tilePool.shuffleDominoes();
        for(player player : players){
            player.clearHand();
            player.clearScore();
        }

    }

    public void dealDominoes(){
        for (int i = 0; i < 7; i++) {
            Collections.shuffle(players);
            for (player player : players) {
                player.dealDominoFromPool(tilePool);
            }
        }
    }







    public tilePool getTilePool() {
        return tilePool;
    }

    public void setTilePool(tilePool tilePool) {
        this.tilePool = tilePool;
    }

    public List<player> getPlayers() {
        return players;
    }

    public void setPlayers(List<player> players) {
        this.players = players;
    }

    public Integer getGameRound() {
        return gameRound;
    }

    public void setGameRound(Integer gameRound) {
        this.gameRound = gameRound;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
