package com.lbg;

public class Hero extends Piece {
    public void moveUp(){
        int[] currentPosition = this.getPosition();
        currentPosition[1]++;
        this.setPosition(currentPosition);
    }

    public void moveDown(){
        int[] currentPosition = this.getPosition();
        currentPosition[1]--;
        this.setPosition(currentPosition);
    }

    public void moveLeft(){
        int[] currentPosition = this.getPosition();
        currentPosition[0]--;
        this.setPosition(currentPosition);
    }

    public void moveRight(){
        int[] currentPosition = this.getPosition();
        currentPosition[0]++;
        this.setPosition(currentPosition);
    }
}
