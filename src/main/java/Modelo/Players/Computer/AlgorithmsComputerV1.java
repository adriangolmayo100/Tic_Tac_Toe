package Modelo.Players.Computer;

import Modelo.Board.Board;

import java.util.LinkedList;
import java.util.List;

public class AlgorithmsComputerV1 implements AlgorithmsComputer{
    private Board board;
    private List<int[]> listCorners;
    public AlgorithmsComputerV1(){super();}
    private int[] lastMove = new int[]{0,0};
    @Override
    public int[] getMove(char token,char rivalToken) {
        return lastMove = MikeyMouseTactic(token,rivalToken);
    }

    @Override
    public void setBoard(Board board) {
        this.board=board;
        initListCorners();
    }

    @Override
    public void clear() {
        initListCorners();
        lastMove = new int[]{0,0};
    }

    private void initListCorners(){
        listCorners = new LinkedList<>();
        int max=board.getSize()-1;
        listCorners.add(new int[]{0,0});
        listCorners.add(new int[]{0,max});
        listCorners.add(new int[]{max,max});
        listCorners.add(new int[]{max,0});
    }

    private int[] MikeyMouseTactic(char token,char rivalToken){
        int size=board.getSize();
        int[] move = winnerMove(token);
        if ( move[0] != -1 )
            return move;
        lastMove[0]=board.getRowLastTurn();
        lastMove[1]=board.getFieldLastTurn();
        move = winnerMove(rivalToken);
        if (move[0] != -1)
            return move;
        if (!board.isBusy(size/2,size/2))
            return new int[]{size / 2, size / 2};
        while (listCorners.size()>0){
            move = listCorners.remove( (int) (Math.random()*listCorners.size()));
            System.out.println("PEPE:" + listCorners.size() + "  " + move[0] + "," + move[1]);
            if (!board.isBusy(move[0],move[1]))
                return move;
        }
        return randomMove();
    }

    private int[] winnerMove(char token){
        int size=board.getSize();
        int counterOfTokens = 0;
        int OnlyOneLeft = size - 1;
        int box = -1;
        int RowLastTurn = lastMove[0];
        char current;
        for ( int i = 0; i < size; i++){
            current = board.get(RowLastTurn, i);
            if( current== token)
                counterOfTokens++;
            //If the number of column is smaller than the counter means it can not be a possible victory
            else{
                if (current != board.getDefaultBox())
                    break;
                box = i;
                if (counterOfTokens < i)
                break;
            }
        }
        if (counterOfTokens == OnlyOneLeft && box > -1)
            return new int[]{RowLastTurn,box};
        counterOfTokens = 0;
        box = -1;
        int FieldLastTurn = lastMove[1];
        for ( int j = 0; j < size; j++){
            current = board.get(j, FieldLastTurn);
            if(current == token)
                counterOfTokens++;
            else{
                if (current != board.getDefaultBox())
                    break;
                box = j;
                if (counterOfTokens < j)
                    break;
            }
        }
        if (counterOfTokens == OnlyOneLeft && box > -1)
            return new int[]{box,FieldLastTurn};
        if (size%2 == 1){
            int counterDiagonal = 0, counterDiagonalInverted = 0;
            int boxDiagonal = -1, boxInverted = -1;
            char currentDiagonal, currentInverted;
            for (int i = 0; i < size; i++){
                currentDiagonal = board.get(i,i);
                if (currentDiagonal==token)
                    counterDiagonal++;
                else
                    if (currentDiagonal == board.getDefaultBox())
                        boxDiagonal = i;
                currentInverted = board.get(i, (size -1) - i);
                if (currentInverted == token)
                    counterDiagonalInverted++;
                else
                    if (currentInverted == board.getDefaultBox())
                        boxInverted = i;
                if (counterDiagonal < i && counterDiagonalInverted < i)
                    break;
            }
            if (counterDiagonal == OnlyOneLeft && boxDiagonal > -1)
                return new int[]{boxDiagonal,boxDiagonal};
            if (counterDiagonalInverted == OnlyOneLeft && boxInverted > -1)
                return new int[]{boxInverted, ( size -1 ) - boxInverted };
        }
        return new int[]{ -1 , -1 };
    }

    private int[] randomMove(){
        int size=board.getSize();
        int rowRandom,fieldRandom;
        do {
            rowRandom = (int) (Math.random()*size);
            fieldRandom = (int) (Math.random()*size);
        }
        while (board.isBusy(rowRandom,fieldRandom));
        return new int[]{rowRandom,fieldRandom};
    }
}
