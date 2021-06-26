package Modelo.Menu.ChangeLanguage;


import Modelo.Menu.Action;
import Modelo.Menu.Application;
import Modelo.Menu.ChangeRival.Enemy;
import Modelo.Output.Output;

import java.util.Scanner;

public class ChangeLanguage extends Action {
    @Override
    public void doAction() {
        Output output = Application.getOutput();
        Scanner input = Application.input;
        Enemy.game = game;
        MenuChangeLanguage option = null;
        while ( option == null ){
            System.out.println(MenuChangeLanguage.getMenu());
            System.out.print(output.getOption());
            int optionNumber = input.nextInt();
            try {
                option = MenuChangeLanguage.getOption(optionNumber);
                option.doAction();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(output.NoAnOption());
            }
        }
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionLanguage();
    }
}
