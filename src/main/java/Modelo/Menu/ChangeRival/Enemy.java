package Modelo.Menu.ChangeRival;

import Modelo.Game.Game;
import Modelo.Players.Player;

public abstract class Enemy {
    public static Game game;
    abstract void changeEnemyImplementation();
    abstract String getTitle();
    protected void setPlayer(Player player){
        game.setPlayer(player,1);
    }
}
