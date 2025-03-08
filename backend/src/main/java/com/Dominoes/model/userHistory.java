package com.Dominoes.model;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class userHistory {


    @Id
    @SequenceGenerator(
            name = "userHistory_id_sequence",
            sequenceName = "userHistory_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userHistory_id_sequence"

    )
    private Integer id;

    @OneToMany (cascade = CascadeType.DETACH)
    private List<game> wonGame;

    @OneToMany(cascade = CascadeType.DETACH)
    private List<game> lostGame;



    public userHistory() {}

    public userHistory(List<game> wonGame, List<game> lostGame) {
        this.wonGame = wonGame;
        this.lostGame = lostGame;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<game> getWonGame() {
        return wonGame;
    }

    public void setWonGame(List<game> wonGame) {
        this.wonGame = wonGame;
    }

    public List<game> getLostGame() {
        return lostGame;
    }

    public void setLostGame(List<game> lostGame) {
        this.lostGame = lostGame;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        userHistory that = (userHistory) o;
        return Objects.equals(id, that.id) && Objects.equals(wonGame, that.wonGame) && Objects.equals(lostGame, that.lostGame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wonGame, lostGame);
    }

    @Override
    public String toString() {
        return "userHistory{" +
                "id=" + id +
                ", wonGame=" + wonGame +
                ", lostGame=" + lostGame +
                '}';
    }
}
