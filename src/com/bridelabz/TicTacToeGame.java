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

        while(true) {
            showBoard();
            playerTurn();
            checkFreeSpace();
            checkFirstPlayer();
            winner();
            computerTurn();
        }
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
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your location(1-9): ");
            playerMove = scanner.nextInt();
        } while (board[playerMove] != ' ');

        System.out.println("Player choose:: " + playerMove);
        board[playerMove] = userLetter;
    }

    private static void checkFreeSpace()
    {
        boolean isSpaceAvailable = false;
        int numOfFreeSpaces = 0;
        for(int index=1;index<board.length;index++)
        {
            if((board[index] == ' '))
            {
                isSpaceAvailable = true;
                numOfFreeSpaces++;
            }
        }
        if(!isSpaceAvailable)
        {
            System.out.println("Board is full! You can't make another move");
            System.exit(0);
        }
        else
        {
            System.out.println("Free space is available! you have "+numOfFreeSpaces+ " moves left");
        }
    }

    private static void checkFirstPlayer()
    {
        int Head = 0;
        double toss = Math.floor(Math.random()*10) % 2;
        if ( toss == Head )
        {
            System.out.println("computer starts to play first");
        }
        else
        {
            System.out.println("User starts to play first");
        }
    }

    private static void winner()
    {
        if ((board[1] == userLetter && board[2] == userLetter && board[3] == userLetter) ||
                (board[4] == userLetter && board[5] == userLetter && board[6] == userLetter) ||
                (board[7] == userLetter && board[8] == userLetter && board[9] == userLetter) ||
                (board[1] == userLetter && board[5] == userLetter && board[9] == userLetter) ||
                (board[3] == userLetter && board[5] == userLetter && board[7] == userLetter))
        {
            showBoard();
            System.out.println("Player win the game");
            System.exit(0);
        }
    }

    private static void computerTurn()
    {
        int computerMove;
        do {
            computerMove = (int) Math.floor(Math.random() * 10) % 9 + 1;

        } while (board[computerMove] != ' ');
        System.out.println("Computer choose:: " + computerMove);
        board[computerMove] = computerLetter;
    }
}

