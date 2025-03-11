package com.Dominoes.model;

import com.Dominoes.DAO.ItileJPA;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Entity
public class tilePool {

    @OneToMany(cascade = CascadeType.DETACH)
    private List<tile> tiles;
    @Id
    @SequenceGenerator(
            name = "tilep_id_sequence",
            sequenceName = "tilep_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tilep_id_sequence"

    )
    private Integer id;


    public tilePool() {

        tiles = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {


                this.tiles.add(new tile(i, j));
            }
        }


    }

    public boolean canDraw() {
        return !(tiles.isEmpty());
    }

    public tile drawDomino() {
        Random rand = new Random();
        if (canDraw()) {
            return tiles.get(rand.nextInt(28));
        } else {
            return null;
        }
    }

    public List<tile> shuffleDominoes() {
        List<tile> sTiles = Collections.shuffle(tiles);

        return sTiles;

    }


    public List<tile> getTiles() {
        return tiles;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}


