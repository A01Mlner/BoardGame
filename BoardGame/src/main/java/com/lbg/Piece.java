package com.lbg;
import java.util.Random;

public class Piece {

    private int[] position = new int[2]; //[xpos,ypos]

    public int[] genRandomPosition(int[] BoardSize) {
        Random random = new Random();
        int[] newPosition = new int[2];
        for(int i =0;i<2;i++){
            newPosition[i] = random.nextInt(BoardSize[i]); //gen a random number between 0 (inclusive) and BoardSize
        }
        return newPosition;
    }


    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Piece: {X-position: ").append(position[0]).append(", Y-position: ").append(position[1]).append("}");
        return sb.toString();
    }
}
