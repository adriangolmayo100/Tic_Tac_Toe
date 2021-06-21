package Modelo.Players;

import Modelo.Board.Board;

public interface Player {
    int getColum();
    int getRow();
    char getToken();
    void setToken(char token);
    void setBoard(Board board);
}
