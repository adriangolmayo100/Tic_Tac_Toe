package Modelo;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoardV1;
import Modelo.Board.Board;
import Modelo.Board.BoardClass;
import Modelo.Game.Game;
import Modelo.Game.GameClass;
import Modelo.InputAndOutput.Conclude;
import Modelo.InputAndOutput.GetTurn;
import Modelo.InputAndOutput.Presentation;
import Modelo.Players.Computer.AlgorithmsComputerV1;
import Modelo.Players.Computer.Computer;
import Modelo.Players.Player;
import Modelo.Players.PlayerImplementation;

public class Menu {
    Game game;
    public void ejecuta(){
        System.out.print(Presentation.main());
        initGame();
        gameRun();
        System.out.println(Conclude.finish(game.getCurrentPlayer().getName()));
    }
    private void initGame(){
        game = new GameClass();
        Board board= new BoardClass();
        board.setSize(3);
        board.setAlgorithmsBoard(new AlgorithmsBoardV1(board));
        game.setBoard(board);
        Player player =new PlayerImplementation();
        player.setName("Antonio");
        player.setToken('X');
        game.addPlayer(player);
        player=new Computer();
        player.setBoard(board);
        player.setToken('O');
        player.setAlgorithmsComputer(new AlgorithmsComputerV1());
        game.addPlayer(player);
    }
    private void gameRun(){
        int row=0,field=0;
        while (true){
            Player player = game.getCurrentPlayer();
            if (player.isPlayer()){
                System.out.print(game.showBoard());
                row=GetTurn.getRow();
                field=GetTurn.getField();
            }
            else {
                int[] move = player.getMove();
                row=move[0];
                field=move[1];
            }
            game.turn(row,field);
            if (game.hasWon())
                break;
            game.passTurn();
        }
    }
}
