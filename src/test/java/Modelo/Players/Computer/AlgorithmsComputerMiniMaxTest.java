package Modelo.Players.Computer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoardV1;
import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;
import Modelo.Board.Board;
import Modelo.Board.BoardClass;

public class AlgorithmsComputerMiniMaxTest {
    @Test
    void testGetMoveComplete() throws ExceptionBoxIsEmpty {
        AlgorithmsComputer algorithmsComputer = new AlgorithmsComputerMiniMax();
        Board board = new BoardClass();
        board.setSize(3);
        board.clear();
        board.setAlgorithmsBoard(new AlgorithmsBoardV1(board));
        algorithmsComputer.setBoard(board);
        char token = 'a';
        char tokenRival = 'b';
        //Test full row
        board.turn(0,0,token);
        board.turn(0,2,token);
        assertArrayEquals(new int[]{0,1},algorithmsComputer.getMove(token,tokenRival));
        board.clear();
        //Test full field
        board.turn(0,1,token);
        board.turn(2,1,token);
        assertArrayEquals(new int[]{1,1},algorithmsComputer.getMove(token,tokenRival));
        board.clear();
        //Test full diagonal
        board.turn(0,0,token);
        board.turn(1,1,token);
        assertArrayEquals(new int[]{2,2},algorithmsComputer.getMove(token,tokenRival));
        board.clear();
        //Test full diagonal inverted
        board.turn(0,2,token);
        board.turn(2,0,token);
        assertArrayEquals(new int[]{1,1},algorithmsComputer.getMove(token,tokenRival));
    }
    @Test
    void testGetMoveDefense() throws ExceptionBoxIsEmpty {
        AlgorithmsComputer algorithmsComputer = new AlgorithmsComputerMiniMax();
        Board board = new BoardClass();
        board.setSize(3);
        board.clear();
        board.setAlgorithmsBoard(new AlgorithmsBoardV1(board));
        algorithmsComputer.setBoard(board);
        char token = 'a';
        char tokenRival = 'b';
        //Test defend a row
        board.turn(0,0,tokenRival);
        board.turn(0,2,tokenRival);
        assertArrayEquals(new int[]{0,1},algorithmsComputer.getMove(token,tokenRival));
        board.clear();
        //Test defend a field
        board.turn(0,1,tokenRival);
        board.turn(2,1,tokenRival);
        assertArrayEquals(new int[]{1,1},algorithmsComputer.getMove(token,tokenRival));
        board.clear();
        //Test defend a diagonal
        board.turn(0,0,tokenRival);
        board.turn(1,1,tokenRival);
        assertArrayEquals(new int[]{2,2},algorithmsComputer.getMove(token,tokenRival));
        board.clear();
        //Test defend a diagonal inverted
        board.turn(0,2,tokenRival);
        board.turn(2,0,tokenRival);
        assertArrayEquals(new int[]{1,1},algorithmsComputer.getMove(token,tokenRival));
    }
}
