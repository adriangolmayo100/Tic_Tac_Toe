package Modelo.Board;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoard;
import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;

public interface Board {
    void turn(int row,int field,Character token) throws ExceptionBoxIsEmpty;
    boolean hasFinished(Character token);
    void clear();
    String showBoard();
    void setSize(int size);
    boolean hasWinner();
    void setAlgorithmsBoard(AlgorithmsBoard algorithmsBoard);
    char[][] getBoardArray();
    int getRowLastTurn();
    int getFieldLastTurn();
    int getSize();
    char getDefaultBox();
    char get(int row, int column);
    boolean isBusy(int row, int column);
}
