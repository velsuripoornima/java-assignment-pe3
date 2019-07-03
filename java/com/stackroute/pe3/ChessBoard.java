package com.stackroute.pe3;

public class ChessBoard {
    public ChessBoard(){

    }
    public String[][] createChessBoard(int row,int col){

        if(row !=8 || col !=8){
            return null;
        }
        String chessBoard[][]=new String[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i+j) % 2 == 0){
                    chessBoard[i][j]="WW|";
                }else{
                    chessBoard[i][j]="BB|";
                }
            }
        }return chessBoard;
    }
}
