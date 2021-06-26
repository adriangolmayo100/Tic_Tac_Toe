package Modelo.Output.English;

public class ConcludeGame {
    public static String finish(String winner){
        return "The game has finish. The winner is " + winner;
    }
    public static String finish(){
        return "The game has finish. The players have tied ";
    }
}
