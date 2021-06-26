package Modelo.Menu;


import Modelo.Input.ChooseMoneyFace;


public class chooseTurn {
    public static int getTurn(){
        System.out.println(Application.getOutput().getRaffle());
        System.out.print(Application.getOutput().getOption());
        //Math random gets a random face of the money if which matches with the choosing of user get the index of player 1
        int result = (int) Math.round(Math.random());
        int choose = ChooseMoneyFace.getFace();
        System.out.println(Application.getOutput().getRaffleResult(result));
        if ( choose == result )
            return 0;
        return 1;
    }
}
