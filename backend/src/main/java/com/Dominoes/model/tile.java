package com.Dominoes.model;

import jakarta.persistence.*;

@Entity
public class tile {

    @Id
    @SequenceGenerator(
            name = "tile_id_sequence",
            sequenceName = "tile_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tile_id_sequence"

    )
    private int id;
    private int leftValue;
    private int rightValue;

    private boolean isDouble;

    public tile() {}

    public tile(int leftValue, int rightValue) {
        if (leftValue >= 0 && leftValue <= 6) {
            this.leftValue = leftValue;
        }
        if(rightValue >= 0 && rightValue <= 6){
            this.rightValue = rightValue;
        }
        if(leftValue==rightValue){
            this.isDouble= true;
        }else{
            this.isDouble=false;
        }
        
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLeftValue() {
        return leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }


    public boolean isDouble(){
        return isDouble;
    }

    @Override
    public String toString()
    {
        String leftStr;
        String rightStr;

        if(leftValue >= 1  && leftValue <= 6)
            leftStr = "[" +leftValue;
        else leftStr = "[ ";

        if(rightValue >= 1  && rightValue <= 6)
            rightStr = rightValue + "]";
        else rightStr = " ]";

        return leftStr + "|"+ rightStr;
    }

    public int getmaxvalue(){
        return leftValue+rightValue;
    }



}
