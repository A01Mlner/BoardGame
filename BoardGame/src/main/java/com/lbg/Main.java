package com.lbg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameState = true;

        // Takes the boundaries from user input and initializes the board
        int[] boardSize = {getUserBoundaryInput('x'), getUserBoundaryInput('y')};
        Board board = new Board(boardSize);
        board.printBoardState();
        // Add Pieces


        /*
        while (gameState){

            // Prints Board State from user perspective
            board.printBoardState();





            // boolean treasureFound =
            // int livesCount =

            // Either treasure is found or no lives left
            if (treasureFound == true || livesCount <= 0){
                gameState = false;
            }


        }
        */
    }


    public static int getUserBoundaryInput(char boundaryType){
        String formattedString = String.format("Input %s boundary value:", boundaryType);
        System.out.println(formattedString);
        Scanner numberInputScanner = new Scanner(System.in);
        int scannerValue = numberInputScanner.nextInt();
        return scannerValue;
    }


    public static void getUserMovementInput(){
        Scanner movementInputScanner = new Scanner(System.in);
        String movementDirection = movementInputScanner.nextLine();
        System.out.println("Input a direction to move to (w, a, s, d) or (up, down, left, right)");

        switch (movementDirection) {
            case "w", "up":
                moveUp();
                break;
            case "s", "down":
                moveDown();
                break;
            case "a", "left":
                moveLeft();
                break;
            case "d", "right":
                moveRight();
                break;
            default:
                System.out.println("Input direction not valid");
        }
        
        movementInputScanner.close();
    }
}