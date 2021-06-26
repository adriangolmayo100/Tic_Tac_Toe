package Modelo.Board;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoard;
import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;

public class BoardClass implements Board{
    private static final char boxDefault = '*';
    private char[][] boardArray;
    private boolean[][] mapEmptyBox;
    private int dirty;
    private int boxes;
    private int size;
    //board contains the Board
    private int rowLastTurn;
    private int fieldLastTurn;
    private boolean hasWinner = false;
    private AlgorithmsBoard algorithmsBoard;

    public BoardClass(){
        super();
    }

    @Override
    public void turn(int row,int field,Character token) throws ExceptionBoxIsEmpty{
        if (isBusy(row,field))
            throw new ExceptionBoxIsEmpty(row,field);
        boardArray[row][field]=token;
        mapEmptyBox[row][field]=true;
        rowLastTurn=row;
        fieldLastTurn=field;
        dirty++;
    }

    @Override
    public boolean hasFinished(Character token) {
        return ( dirty >= boxes || checkInRow(token) );
    }

    private boolean checkInRow(Character token) {
        return hasWinner = algorithmsBoard.check(token);
    }

    @Override
    public void clear() {
        boardArray =new char[size][size];
        mapEmptyBox = new boolean[size][size];
        boxes = size * size;
        dirty = 0;
        for (int i = 0; i < size ; i++)
            for (int j = 0; j < size ; j++)
                boardArray[i][j] = boxDefault;
    }
    @Override
    public String showBoard() {
        StringBuilder display=new StringBuilder();
        for (char[] row: boardArray){
            display.append("\t");
            for (char box : row){
                display.append(box).append(" ");
            }
            display.append("\n");
        }
        return display.toString();
    }

    @Override
    public void setSize(int size) {
        this.size=size;
        clear();
    }

    @Override
    public boolean hasWinner() {
        return hasWinner;
    }

    @Override
    public void setAlgorithmsBoard(AlgorithmsBoard algorithmsBoard) {
        this.algorithmsBoard=algorithmsBoard;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public char getDefaultBox() {
        return boxDefault;
    }

    @Override
    public char get(int row, int column) {
        return boardArray[row][column];
    }

    @Override
    public boolean isBusy(int row, int column) {
        return mapEmptyBox[row][column];
    }


    @Override
    public char[][] getBoardArray() {
        return boardArray;
    }

    @Override
    public int getRowLastTurn() {
        return rowLastTurn;
    }

    @Override
    public int getFieldLastTurn() {
        return fieldLastTurn;
    }
}