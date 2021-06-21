package Modelo.Players;

import Modelo.Board.Board;

public class PlayerImplementation implements Player{
    private final static char token='X';
    private Board board;

    @Override
    public int getColum() {
        return 0;
    }

    @Override
    public int getRow() {
        return 0;
    }

    @Override
    public char getToken() {
        return token;
    }

    @Override
    public void setBoard(Board board) {
        this.board=board;
    }
}
