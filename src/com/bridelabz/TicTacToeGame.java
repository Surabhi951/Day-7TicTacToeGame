package com.bridelabz;

public class TicTacToeGame {
    static char[] board = new char[10];

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe Game");

        createEmptyBoard();
        }

        private static void createEmptyBoard(){
            for(int index=1; index<board.length; index++){
                board[index] = ' ';
            }
        }
    }

