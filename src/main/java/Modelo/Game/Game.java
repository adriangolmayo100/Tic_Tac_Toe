package Modelo.Game;

import Modelo.Board.Board;
import Modelo.Players.Player;

public interface Game {
    void start();
    void turn(int field, int row);
    void passTurn();
    boolean hasWon();
    void setBoard(Board board);
    Board getBoard();
    Player getPlayer();
    void setPlayer1(Player player);
    void setPlayer2(Player player);

}
