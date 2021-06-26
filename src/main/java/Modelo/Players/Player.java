package Modelo.Players;

import Modelo.Board.Board;
import Modelo.Players.Computer.AlgorithmsComputer;

public interface Player {
    boolean isPlayer();
    int[] getMove();
    char getToken();
    void setTokenPlayer(Character token);
    default void setRivalToken(Character tokenRival){};
    default void setBoard(Board board){}
    void setName(String name);
    String getName();
    default void setAlgorithmsComputer(AlgorithmsComputer algorithmsComputer){}
    default void clear(){};
}
