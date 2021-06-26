package Modelo.Game;

import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;
import Modelo.Board.Board;
import Modelo.Players.Player;

import java.util.ArrayList;
import java.util.List;

public class GameClass implements Game{
    private Board board;
    private final List<Player> listPlayer = new ArrayList<>();
    int turn=0;
    public GameClass(){
        super();
    }

    @Override
    public void start() {
        board.clear();
        for (Player player : listPlayer)
            player.clear();
    }

    @Override
    public void turn(int row,int field) throws ExceptionBoxIsEmpty {
        board.turn(row,field, getCurrentPlayer().getToken());
    }
    public void passTurn(){
        if (++turn >= listPlayer.size())
            turn=0;
    }
    public boolean hasFinished(){
        return board.hasFinished(getCurrentPlayer().getToken());
    }
    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public boolean hasWinner() {
        return board.hasWinner();
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public Player getPlayer(int index){
        return listPlayer.get(index);
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
    public void setPlayer(Player player, int index) {
        listPlayer.set(index,player);
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
