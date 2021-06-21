package Modelo.Board;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoard;

public interface Board {
    void turn(int row,int field,char token);
    boolean checkInRow(char token);
    void clear();
    String showBoard();
    void setSize(int size);
    void setAlgorithmsBoard(AlgorithmsBoard algorithmsBoard);
    char get(int row,int field);
    char[][] getBoardArray();
    int getRowLastTurn();
    int getFieldLastTurn();
    int getSize();
    char getDefaultBox();
}
