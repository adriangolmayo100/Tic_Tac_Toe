package Modelo.Menu.ChangeRival;

import Modelo.Input.Number;
import Modelo.Menu.Action;
import Modelo.Menu.Application;
import Modelo.Output.Output;

import java.util.Scanner;

public class ChangeRival extends Action {
    @Override
    public void doAction() {
        Output output = Application.getOutput();
        Enemy.game = game;
        MenuChangeRival option = null;
        while ( option == null ){
            System.out.println(MenuChangeRival.getMenu());
            System.out.print(output.getOption());
            int optionNumber = Number.getNumber();
            try {
                option = MenuChangeRival.getOption(optionNumber);
                option.action();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(output.NoAnOption());
            }
        }
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionMode();
    }
}

