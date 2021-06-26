package Modelo.Board.AlgorithmsBoard;

import Modelo.Board.Board;
import Modelo.Board.BoardClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsBoardV1Test {

    @Test
    void check() throws ExceptionBoxIsEmpty {
        Board board= new BoardClass();
        board.setSize(3);
        AlgorithmsBoardV1 algorithmsBoardV1 = new AlgorithmsBoardV1(board);
        board.turn(0,0,'O');
        board.turn(1,1,'O');
        board.turn(2,2,'O');
        assertTrue(algorithmsBoardV1.check('O'),"The check method have failed at check diagonals");
        board.turn(0,0,'X');
        board.turn(0,1,'X');
        board.turn(0,2,'X');
        assertFalse(algorithmsBoardV1.check('0'),"The check method have failed at check diagonals");
        assertTrue(algorithmsBoardV1.check('X'),"The check method have failed at check rows");
        board.turn(0,2,'A');
        board.turn(1,2,'A');
        board.turn(2,2,'A');
        assertFalse(algorithmsBoardV1.check('X'),"The check method have failed at check rows");
        assertTrue(algorithmsBoardV1.check('A'),"The check method have failed at check fields");
    }
}