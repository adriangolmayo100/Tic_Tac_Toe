package Modelo.Players.Computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Modelo.Board.Board;
import Modelo.Board.AlgorithmsBoard.AlgorithmsBoard;
import Modelo.Board.AlgorithmsBoard.AlgorithmsBoardV1;
import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;

public class AlgorithmsComputerMiniMax implements AlgorithmsComputer{
    private Board board;
    private char token;
    private char rivalToken;
    private AlgorithmsBoard algorithm;
    public AlgorithmsComputerMiniMax(){
        super();
    }
    @Override
    public int[] getMove(char token,char rivalToken) {
        this.token=token;
        this.rivalToken=rivalToken;
        return miniMax();
    }
    @Override
    public void setBoard(Board board) {
        this.board=board;
    }
    private int[] miniMax(){
        algorithm = new AlgorithmsBoardV1(board);
        int max = -1;
        List<int[]> movements = getMovements();
        Collections.shuffle(movements);
        int[] maxMovement = movements.get(0);
        for (int i=0; i< movements.size(); i++){
            int [] movement = movements.get(i);
            try {
                board.turn(movement[0],movement[1],token);
            } catch (ExceptionBoxIsEmpty e) {
                e.printStackTrace();
            }
            int result=goMin();
            try {
                board.undoTurn(movement[0],movement[1]);
            } catch (ExceptionBoxIsEmpty e) {
                e.printStackTrace();
            }
            if (result>=1)
                return movement;
            if (result > max){
                max = result;
                maxMovement = movement;
            }
        }
        return maxMovement;
    }
    private int goMax(){
        int max = -1;
        int resultNow;
        if ((resultNow = isEnd())!=-2)
            return resultNow;
        List<int[]> movements = getMovements();
        for (int i=0; i< movements.size(); i++){
            int [] movement = movements.get(i);
            try {
                board.turn(movement[0],movement[1],token);
            } catch (ExceptionBoxIsEmpty e) {
                e.printStackTrace();
            }
            int result = goMin();
            try {
                board.undoTurn(movement[0],movement[1]);
            } catch (ExceptionBoxIsEmpty e) {
                e.printStackTrace();
            }
            if (result>=1)
                return result;
            if (result > max)
                max = result;
        }
        return max;
    }
    private int goMin(){
        int min = 1;
        int resultNow;
        if ((resultNow = isEnd())!=-2)
            return resultNow;
        List<int[]> movements = getMovements();
        for (int i=0; i< movements.size(); i++){
            int [] movement = movements.get(i);
            try {
                board.turn(movement[0],movement[1],rivalToken);
            } catch (ExceptionBoxIsEmpty e) {
                e.printStackTrace();
            }
            int result = goMax();
            try {
                board.undoTurn(movement[0],movement[1]);
            } catch (ExceptionBoxIsEmpty e) {
                e.printStackTrace();
            }
            if (result<=-1)
                return result;
            if (result < min)
                min = result; 
        }
        return min;
    }
    private List<int[]> getMovements(){
        int size = board.getSize();
        List<int[]> movements = new ArrayList<int[]>();
        char token;
        for (int i = 0; i< size; i++){
            for (int j = 0; j< size; j++){
                token = board.get(i, j);
                if (token == board.getDefaultBox())
                    movements.add(new int[]{i, j});
            }
        }
        return movements;
    }
    /**
     * Check if the game is over and return the result
     * @return -1 if the game is lost, 1 if the game is won, 0 if the game is draw and -2 if the game is not over
     */
    private int isEnd(){
        if (algorithm.check(token))
            return 1; 
        if (algorithm.check(rivalToken))
            return -1; 
        if(board.getBoxes()==board.getDirty())
            return 0;
        return -2;
    }
    @Override
    public void clear() {
    }
}
    