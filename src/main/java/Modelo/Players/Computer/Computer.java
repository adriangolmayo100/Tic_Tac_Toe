package Modelo.Players.Computer;

import Modelo.Board.Board;
import Modelo.Players.Player;

public class Computer implements Player {
    private String name;
    private Board board;
    private Character token;
    private Character rivalToken;
    private AlgorithmsComputer algorithmsComputer;

    public Computer(){
        super();
    }

    @Override
    public boolean isPlayer() {
        return false;
    }

    @Override
    public int[] getMove() {
        return algorithmsComputer.getMove(token,rivalToken);
    }

    @Override
    public char getToken() {
        return token;
    }

    @Override
    public void setTokenPlayer(Character token) {
        this.token=token;
    }

    @Override
    public void setRivalToken(Character rivalToken){
        this.rivalToken =rivalToken;
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
    @Override
    public void clear(){
        algorithmsComputer.clear();
    }
}
