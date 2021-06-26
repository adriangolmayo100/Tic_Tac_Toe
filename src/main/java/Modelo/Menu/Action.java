package Modelo.Menu;

import Modelo.Game.Game;

public abstract class Action {
    public static Game game;
    public abstract void doAction();
    public abstract String getTitle();
}
