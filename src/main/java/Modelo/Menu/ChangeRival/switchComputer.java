package Modelo.Menu.ChangeRival;

import Modelo.Menu.Application;
import Modelo.Players.Computer.AlgorithmsComputerV1;
import Modelo.Players.Computer.Computer;
import Modelo.Players.Player;

public class switchComputer extends Enemy {
    @Override
    void changeEnemyImplementation() {
        Player player = new Computer();
        player.setBoard(game.getBoard());
        player.setName("Player 2");
        player.setTokenPlayer('O');
        player.setAlgorithmsComputer(new AlgorithmsComputerV1());
        setPlayer(player);
    }

    @Override
    String getTitle() {
        return Application.getOutput().getVsComputer();
    }
}
