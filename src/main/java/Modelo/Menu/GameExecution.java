package Modelo.Menu;

import Modelo.Board.AlgorithmsBoard.ExceptionBoxIsEmpty;
import Modelo.Input.Turn;
import Modelo.Output.Output;
import Modelo.Players.Player;


public class GameExecution extends Action{
    GameExecution(){
        super();
    }
    @Override
    public void doAction() {
        Output output = Application.getOutput();
        game.start();
        int row,field;
        while (true){
            Player player = game.getCurrentPlayer();
            while (true){
                try {
                    if (player.isPlayer()) {
                        System.out.print(game.showBoard());
                        System.out.print(output.getRow());
                        row = Turn.getRow();
                        System.out.print(output.getField());
                        field = Turn.getField();
                    }
                    else {
                        int[] move = player.getMove();
                        row=move[0];
                        field=move[1];
                    }
                    game.turn(row,field);
                    break;
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println(output.indexOutOfBounds());
                }
                catch (ExceptionBoxIsEmpty e){
                    System.out.println(output.boxIsBusy());
                }
                catch (Exception e){
                    System.out.println(output.passInteger());
                }
            }
            if (game.hasFinished())
                break;
            game.passTurn();
        }
        System.out.print(game.showBoard());
        if (game.hasWinner())
            System.out.println(output.finish(game.getCurrentPlayer().getName()));
        else
            System.out.println(output.finish());

    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionStart();
    }

}
