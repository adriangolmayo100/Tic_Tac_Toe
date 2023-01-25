package Modelo.Menu;

import Modelo.Input.Number;
import Modelo.Players.Player;
import Modelo.Players.Computer.AlgorithmsComputerMiniMax;
import Modelo.Players.Computer.AlgorithmsComputerV1;

public class ChangeSize extends Action {
    @Override
    public void doAction() {
        int number;
        System.out.print(Application.getOutput().getSize());
        number = Number.getNumber();
        if (number > 3)
            for (Player player: game.getListPlayer()) {
                if (!player.isPlayer())
                    player.setAlgorithmsComputer(new AlgorithmsComputerV1());
            }
        else 
        for (Player player: game.getListPlayer()) {
            if (!player.isPlayer())
                player.setAlgorithmsComputer(new AlgorithmsComputerMiniMax());
        }
        game.setSize(number);
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionSize();
    }
}
