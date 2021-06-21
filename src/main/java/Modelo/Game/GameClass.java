package Modelo.Game;

import Modelo.Board.Board;
import Modelo.Players.Player;

public class GameClass implements Game{
    private Board board;
    private Player player1;
    private Player player2;
    Player playerTurn=player1;
    public GameClass(){
        super();
    }

    @Override
    public void start() {
        board.clear();
    }

    @Override
    public void turn(int row,int field) {
        board.turn(row,field,playerTurn.getToken());
    }
    public void passTurn(){
        if (playerTurn==player1)
            playerTurn=player2;
        else
            playerTurn=player1;
    }
    public boolean hasWon(){
        return board.checkInRow(playerTurn.getToken());
    }
    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }


    @Override
    public Player getPlayer() {
        return playerTurn;
    }

    @Override
    public void setPlayer1(Player player) {
        this.player1=player;
    }

    @Override
    public void setPlayer2(Player player) {
        this.player2=player;
    }

}
