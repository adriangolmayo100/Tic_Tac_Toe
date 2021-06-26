package Modelo.Menu.ChangeRival;

import Modelo.Menu.Application;
import Modelo.Players.Player;
import Modelo.Players.PlayerImplementation;

public class switchPlayer extends Enemy {
    @Override
    void changeEnemyImplementation() {
        Player player = new PlayerImplementation();
        player.setName("Player 2");
        player.setTokenPlayer('O');
        setPlayer(player);
    }

    @Override
    String getTitle() {
        return Application.getOutput().getVsPlayer();
    }
}
