package Modelo.Game;

import Modelo.Board.Board;
import Modelo.Players.Player;

public interface Game {
    void start();
    void turn(int row, int field);
    void passTurn();
    boolean hasWon();
    void setBoard(Board board);
    Board getBoard();
    Player getCurrentPlayer();
    void addPlayer(Player player);
    String showBoard();
    void setSize(int size);
}
