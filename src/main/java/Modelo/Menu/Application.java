package Modelo.Menu;

import Modelo.Game.Game;
import Modelo.Output.English.OutputEnglish;
import Modelo.Output.Output;


import java.util.Scanner;

public class Application {
    public static Game game;
    public static Scanner input = new Scanner(System.in);
    private static Output output = new OutputEnglish();
    public void run(){
        System.out.print(output.main());
        new initGame().doAction();
        game = Action.game;
        Menu();
    }

    private void Menu(){
        Menu option = Menu.START;
        do {
            System.out.println(Menu.getMenu());
            System.out.print(output.getOption());
            int optionNumber = input.nextInt();
            try {
                option = Menu.getOption(optionNumber);
                option.doAction();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(output.NoAnOption());
            }
        }
        while (option != Menu.EXIT);
    }
    public static void setOutput(Output output1){
        output=output1;
    }
    public static Output getOutput(){
        return output;
    }

}
