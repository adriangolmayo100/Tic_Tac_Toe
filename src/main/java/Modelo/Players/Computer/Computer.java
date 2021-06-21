package Modelo.Players.Computer;

import Modelo.Board.Board;
import Modelo.Players.Player;

public class Computer implements Player {
    private final boolean player = false;
    private String name;
    private Board board;
    private char token;
    private AlgorithmsComputer algorithmsComputer;

    public Computer(){
        super();
    }

    @Override
    public boolean isPlayer() {
        return player;
    }

    @Override
    public int[] getMove() {
        return algorithmsComputer.getMove();
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
    public void setAlgorithmsComputer(AlgorithmsComputer algorithmsComputer) {
        this.algorithmsComputer = algorithmsComputer;
        this.algorithmsComputer.setBoard(board);
    }

    @Override
    public void setBoard(Board board) {
        this.board=board;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
