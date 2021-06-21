package Modelo.Board;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoard;

public class BoardClass implements Board{
    private static final char boxDefault = '*';
    char[][] boardArray;
    int size;
    //board contains the Board
    int rowLastTurn;
    int fieldLastTurn;
    AlgorithmsBoard algorithmsBoard;

    public BoardClass(){
        super();
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
        for (int i = 0; i < size ; i++)
            for (int j = 0; j < size ; j++)
                boardArray[i][j] = boxDefault;
    }
    @Override
    public String showBoard() {
        StringBuilder display=new StringBuilder();
        for (char[] row: boardArray){
            display.append("\t");
            for (char box : row){
                display.append(box).append(" ");
            }
            display.append("\n");
        }
        return display.toString();
    }

    @Override
    public void setSize(int size) {
        this.size=size;
        clear();
    }

    @Override
    public void setAlgorithmsBoard(AlgorithmsBoard algorithmsBoard) {
        this.algorithmsBoard=algorithmsBoard;
    }

    @Override
    public char get(int row, int field) {
        return boardArray[row][field];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public char getDefaultBox() {
        return boxDefault;
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