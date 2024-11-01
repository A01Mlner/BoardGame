package com.lbg;

public class Board {
    public int[] getBoardSize() {
        return boardSize;
    }

//    public void setBoardSize(int[] boardSize) {
//        this.boardSize = boardSize;
//    }

    private int[] boardSize;

    public Board(int[] boardSize){
        this.boardSize = boardSize;
    }


}
