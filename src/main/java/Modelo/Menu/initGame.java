package Modelo.Menu;

import Modelo.Board.AlgorithmsBoard.AlgorithmsBoardV1;
import Modelo.Board.Board;
import Modelo.Board.BoardClass;
import Modelo.Game.Game;
import Modelo.Game.GameClass;
import Modelo.Input.Name;
import Modelo.Output.Output;
import Modelo.Players.Computer.AlgorithmsComputerV1;
import Modelo.Players.Computer.Computer;
import Modelo.Players.Player;
import Modelo.Players.PlayerImplementation;

public class initGame{
    public static Game doAction() {
        Output output = Application.getOutput();
        Game game = new GameClass();
        Board board= new BoardClass();
        board.setSize(3);
        board.setAlgorithmsBoard(new AlgorithmsBoardV1(board));
        game.setBoard(board);
        Player player =new PlayerImplementation();
        System.out.print(output.getName());
        player.setName(Name.getName());
        Character token = 'X';
        Character tokenRival = 'O';
        player.setTokenPlayer(token);
        game.addPlayer(player);
        player=new Computer();
        player.setName("Computer1");
        player.setBoard(board);
        player.setTokenPlayer(tokenRival);
        player.setRivalToken(token);
        player.setAlgorithmsComputer(new AlgorithmsComputerV1());
        game.addPlayer(player);
        return game;
    }
}
