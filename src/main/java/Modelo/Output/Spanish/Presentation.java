package Modelo.Output.Spanish;

public class Presentation {
    public static String main(){
        return beginning() +
                rules();
    }
    private static String beginning(){
        return "Bienvenidos al juego del tres en raya\n";
    }
    private static String rules(){
        return "El objetivo es hacer un tres en raya si por ejemplo el tablero es de tamaño 3\n";
    }
}
