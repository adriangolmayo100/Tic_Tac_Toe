package Modelo.Menu;

import Modelo.Input.Number;

public class ChangeSize extends Action {
    @Override
    public void doAction() {
        System.out.print(Application.getOutput().getSize());
        game.setSize(Number.getNumber());
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionSize();
    }
}
