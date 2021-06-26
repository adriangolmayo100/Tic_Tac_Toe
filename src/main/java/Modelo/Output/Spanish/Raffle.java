package Modelo.Output.Spanish;

public class Raffle {
    public static String getDescription(){
        return "Tienes que elegir entre cara o cruz de la moneda para elegir quién empieza\nCara:0\nCruz:1";
    }
    public static String getResult(int result){
        if (result == 0)
            return "El resultado es: Cara";
        return "El resultado es: Cruz";
    }
    public static String getWinner(String winner){
        return "El ganador es: " + winner;
    }
}
