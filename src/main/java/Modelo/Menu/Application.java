package Modelo.Menu;

import Modelo.Game.Game;
import Modelo.Input.Number;
import Modelo.Output.English.OutputEnglish;
import Modelo.Output.Output;


public class Application {
    public static Game game;
    private static Output output = new OutputEnglish();
    public void run(){
        System.out.print(output.main());
        game = initGame.doAction();
        Action.game = game;
        Menu();
    }

    private void Menu(){
        Menu option = Menu.START;
        int optionNumber;
        do {
            System.out.println(Menu.getMenu());
            System.out.print(output.getOption());
            try {
                optionNumber = Number.getNumber();
                option = Menu.getOption(optionNumber);
                option.doAction();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(output.NoAnOption());
            }
            catch (Exception e){
                System.out.println(output.dataNoValid());
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
