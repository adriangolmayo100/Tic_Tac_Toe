package Modelo.Game;

import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;

import java.util.List;

import Modelo.Board.Board;
import Modelo.Players.Player;

public interface Game {
    void start();
    void turn(int row, int field) throws ExceptionBoxIsEmpty;
    void passTurn();
    Player getPlayer(int index);
    boolean hasFinished();
    void setBoard(Board board);
    boolean hasWinner();
    Board getBoard();
    void setCurrentPlayer(int index);
    Player getCurrentPlayer();
    void addPlayer(Player player);
    void setPlayer(Player player, int index);
    String showBoard();
    void setSize(int size);
    List<Player> getListPlayer();
}
