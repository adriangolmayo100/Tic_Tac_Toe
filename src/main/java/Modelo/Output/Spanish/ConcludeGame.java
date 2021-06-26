package Modelo.Output.Spanish;

public class ConcludeGame {
    public static String finish(String winner){
        return "El juego ha terminado el ganador es:  " + winner;
    }
    public static String finish(){
        return "El juego ha terminado. Los jugadores han empatado";
    }
}
