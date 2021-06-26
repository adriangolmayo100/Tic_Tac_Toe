package Modelo.Menu;

import Modelo.Input.Name;


public class ChangeName extends Action{
    @Override
    public void doAction() {
        System.out.print(Application.getOutput().getName());
        game.getPlayer(0).setName(Name.getName());
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionName();
    }
}
