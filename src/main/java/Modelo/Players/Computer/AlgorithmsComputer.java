package Modelo.Players.Computer;

import Modelo.Board.Board;

public interface AlgorithmsComputer {
    int[] getMove(char token,char rivalToken);
    void setBoard(Board board);
    void clear();
}
