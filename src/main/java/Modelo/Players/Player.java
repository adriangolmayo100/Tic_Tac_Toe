package Modelo.Players;

import Modelo.Board.Board;
import Modelo.Players.Computer.AlgorithmsComputer;

public interface Player {
    boolean isPlayer();
    int[] getMove();
    char getToken();
    void setToken(char token);
    void setBoard(Board board);
    void setName(String name);
    String getName();
    default void setAlgorithmsComputer(AlgorithmsComputer algorithmsComputer){}
}
