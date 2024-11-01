package com.lbg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameState = true;

        // Takes the boundaries from user input and initializes the board
        int[] boardSize = {getUserInput('x'), getUserInput('y')};
        Board board = new Board(boardSize);
        board.printBoardState();

        // Add Pieces


        /*
        while (gameState){

            // Prints Board State from user perspective
            board.printBoardState(board, boardSize);


            // boolean treasureFound =
            // int livesCount =

            // Either treasure is found or no lives left
            if (treasureFound == true || livesCount <= 0){
                gameState = false;
            }


        }
        */
    }


    public static int getUserInput(char boundaryType){
        String formattedString = String.format("Input %s boundary value:", boundaryType);
        System.out.println(formattedString);
        Scanner numberInputScanner = new Scanner(System.in);
        int scannerValue = numberInputScanner.nextInt();
        return scannerValue;
    }
}