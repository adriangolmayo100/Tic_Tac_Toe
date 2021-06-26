package Modelo.Menu;

import Modelo.Input.Token;

public class ChangeToken extends Action{
    @Override
    public void doAction() {
        System.out.print(Application.getOutput().getToken());
        char token = Token.GetToken();
        if (token == game.getBoard().getDefaultBox())
            throw new IllegalArgumentException();
        game.getPlayer(0).setTokenPlayer(token);
        game.getPlayer(1).setRivalToken(token);
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionToken();
    }
}
