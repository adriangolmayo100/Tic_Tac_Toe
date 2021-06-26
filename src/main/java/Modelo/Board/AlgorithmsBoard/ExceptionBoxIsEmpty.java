package Modelo.Board.AlgorithmsBoard;

public class ExceptionBoxIsEmpty extends Exception{
    public ExceptionBoxIsEmpty(int row, int field){
        super(String.format("The box %d,%d is busy",row,field));
    }
}
