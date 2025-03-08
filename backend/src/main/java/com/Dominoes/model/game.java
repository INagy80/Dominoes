package com.Dominoes.model;

import jakarta.persistence.*;

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



    public game() {}

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
