package com.lbg;

public class Treasure extends Piece{
    boolean found;

    public Treasure(boolean found){
        this.found = found;
    }

    public Treasure(){
        this.found = false;
    }
}
