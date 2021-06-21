package Modelo.Board.AlgorithmsBoard;

import Modelo.Board.Board;

public class AlgorithmsBoardV1 implements AlgorithmsBoard {
    Board board;
    public AlgorithmsBoardV1(){
        super();
    }
    public AlgorithmsBoardV1(Board board){
        super();
        this.board=board;
    }
    @Override
    public boolean check(char token) {
        return checkRow(token) || checkField(token) || checkDiagonal(token);
    }
    private boolean checkRow(char token){
        int row = board.getRowLastTurn();
        int size = board.getSize();
        char[][] boardArray = board.getBoardArray();
        for (int i = 0; i < size; i++){
            if (boardArray[row][i]!=token)
                return false;
        }
        return true;
    }
    private boolean checkField(char token){
        int field = board.getFieldLastTurn();
        int size = board.getSize();
        char[][] boardArray = board.getBoardArray();
        for (int i = 0; i < size; i++){
            if (boardArray[i][field]!=token)
                return false;
        }
        return true;
    }
    private boolean checkDiagonal(char token){
        int size = board.getSize();
        if (size%2==0)
            return false;
        char[][] boardArray = board.getBoardArray();
        for (int i = 0; i < size; i++){
            if (boardArray[i][i]!=token)
                return false;
        }
        return true;
    }
}
