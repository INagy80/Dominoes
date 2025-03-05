package com.Dominoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class dominoTile {
    @Id
    private int idT;
    private int sideA;
    private int sideB;

    public dominoTile() {}

    public dominoTile(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }
    public int getId() {
        return idT;
    }
    public void setId(int idT) {
        this.idT = idT;
    }
    public int getSideA() {
        return sideA;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

}
