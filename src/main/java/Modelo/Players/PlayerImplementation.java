package Modelo.Players;

import Modelo.Board.Board;

public class PlayerImplementation implements Player{
    private final boolean player = true;
    private String name;
    private char token='X';
    private Board board;
    public PlayerImplementation(){super();}

    @Override
    public boolean isPlayer() {
        return player;
    }

    @Override
    public int[] getMove() {
        board.getSize();
        return new int[0];
    }

    @Override
    public char getToken() {
        return token;
    }

    @Override
    public void setToken(char token) {
        this.token=token;
    }

    @Override
    public void setBoard(Board board) {
        this.board=board;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
