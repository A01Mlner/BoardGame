package com.lbg;

public abstract class Monster extends Piece{
    public abstract String greeting();
    public int livesLost(){
        return 1;
    };
}
