package com.bridelabz;
import java.util.Scanner;
public class TicTacToeGame {
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createEmptyBoard();
        chooseLetter();
        showBoard();
        playerTurn();
    }

    private static void createEmptyBoard()
    {
        for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
    }

    private static void chooseLetter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }

    private static void showBoard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    private static void playerTurn()
    {
        int playerMove;
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your location(1-9): ");
            playerMove = scanner.nextInt();
            if (board[playerMove] == ' ')
            {
                break;
            }
        }
        System.out.println("Player choose:: " + playerMove);
        board[playerMove] = userLetter;
    }

}

