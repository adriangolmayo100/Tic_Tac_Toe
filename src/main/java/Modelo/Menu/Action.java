package Modelo.Menu;

import Modelo.Game.Game;

public abstract class Action {
    public static Game game;
    public abstract void doAction() throws InterruptedException;
    public abstract String getTitle();
}
