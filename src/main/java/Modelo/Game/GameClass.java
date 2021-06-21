package Modelo.Game;

import Modelo.Board.Board;
import Modelo.Players.Player;

import java.util.LinkedList;
import java.util.List;

public class GameClass implements Game{
    private Board board;
    private final List<Player> listPlayer = new LinkedList<>();
    int turn=0;
    public GameClass(){
        super();
    }

    @Override
    public void start() {
        board.clear();
    }

    @Override
    public void turn(int row,int field) {
        board.turn(row,field, getCurrentPlayer().getToken());
    }
    public void passTurn(){
        if (++turn >= listPlayer.size())
            turn=0;
    }
    public boolean hasWon(){
        return board.checkInRow(getCurrentPlayer().getToken());
    }
    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }


    @Override
    public Player getCurrentPlayer() {
        return listPlayer.get(turn);
    }

    @Override
    public void addPlayer(Player player) {
        listPlayer.add(player);
    }

    @Override
    public String showBoard() {
        return board.showBoard();
    }

    @Override
    public void setSize(int size) {
        board.setSize(size);
    }
}
