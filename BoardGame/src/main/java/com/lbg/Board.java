package com.lbg;

public class Board {
    public int[] getBoardSize() {
        return boardSize;
    }

//    public void setBoardSize(int[] boardSize) {
//        this.boardSize = boardSize;
//    }

    private int[] boardSize;
    private String[][] boardState;

    public Board(int[] boardSize){
        this.boardSize = boardSize;
        this.boardState = new String[boardSize[0]][boardSize[1]];
        initializeBoard();
    }

    // TODO swap x and y around
    private void initializeBoard(){
        for (int i = 0; i < boardSize[0]; i++) {
            for (int j = 0; j < boardSize[1]; j++) {
                boardState[i][j] = "X";
            }
        }
    }


    public void printBoardState(){

        for (int i=0; i < boardSize[0]; i++){
            for (int j=0; j < boardSize[1]; j++){
                if (!boardState[i][j].equals("h") && !boardState[i][j].equals("mf")){
                    System.out.print(boardState[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


}
