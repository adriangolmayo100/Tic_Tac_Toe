package Modelo.Board;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoard;

public class BoardClass implements Board{
    char[][] boardArray;
    int size;
    //board contains the Board
    int rowLastTurn;
    int fieldLastTurn;
    AlgorithmsBoard algorithmsBoard;

    public BoardClass(){
        super();
    }
    public BoardClass(int size){
        super();
        this.size=size;
        clear();
    }
    @Override
    public void turn(int row,int field,char token) {
        boardArray[row][field]=token;
        rowLastTurn=row;
        fieldLastTurn=field;
    }

    @Override
    public boolean checkInRow(char token) {
        return algorithmsBoard.check(token);
    }

    @Override
    public void clear() {
        boardArray =new char[size][size];
    }
    @Override
    public String showBoard() {
        StringBuilder display=new StringBuilder();
        for (char[] row: boardArray){
            display.append(row.toString() + "\n");
        }
        return display.toString();
    }

    @Override
    public void setSize(int size) {
        this.size=size;
    }

    @Override
    public void setAlgorithmsBoard(AlgorithmsBoard algorithmsBoard) {
        this.algorithmsBoard=algorithmsBoard;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public char[][] getBoardArray() {
        return boardArray;
    }

    @Override
    public int getRowLastTurn() {
        return rowLastTurn;
    }

    @Override
    public int getFieldLastTurn() {
        return fieldLastTurn;
    }
}