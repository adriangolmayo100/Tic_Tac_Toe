package Modelo.Players;

import Modelo.Board.Board;

public class ComputerAlgorithm implements Player{
    Board board;
    char token;
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
    public void setToken(char token) {
        this.token=token;
    }


    @Override
    public void setBoard(Board board) {
        this.board=board;
    }
}
