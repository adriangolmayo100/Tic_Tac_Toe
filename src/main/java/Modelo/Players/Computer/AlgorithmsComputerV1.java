package Modelo.Players.Computer;

import Modelo.Board.Board;

import java.util.LinkedList;
import java.util.List;

public class AlgorithmsComputerV1 implements AlgorithmsComputer{
    private Board board;
    private final List<int[]> listCorners=new LinkedList<>();
    public AlgorithmsComputerV1(){super();}
    @Override
    public int[] getMove() {
        return MikeyMouseTatic();
    }

    @Override
    public void setBoard(Board board) {
        this.board=board;
        initListCorners();

    }
    private void initListCorners(){
        int max=board.getSize()-1;
        listCorners.add(new int[]{0,0});
        listCorners.add(new int[]{0,max});
        listCorners.add(new int[]{max,max});
        listCorners.add(new int[]{max,0});
    }

    private int[] MikeyMouseTatic(){
        int size=board.getSize();
        if (!isBusy(size/2,size/2))
            return new int[]{size / 2, size / 2};
        int freeCorners=listCorners.size();
        if (freeCorners>0)
            return listCorners.remove( (int) (Math.random()*freeCorners));
        int rowRandom,fieldRandom;
        do {
            rowRandom = (int) (Math.random()*size);
            fieldRandom = (int) (Math.random()*size);
        }
        while (isBusy(rowRandom,fieldRandom));
        return new int[]{rowRandom,fieldRandom};
    }
    private boolean isBusy(int row,int field){
        return board.get(row,field) != board.getDefaultBox();
    }
}
