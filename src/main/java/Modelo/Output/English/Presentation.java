package Modelo.Output.English;

public class Presentation {
    public static String main(){
        return beginning() +
                rules();
    }
    private static String beginning(){
        return "Welcome to the game Tic Tac Toe\n";
    }
    private static String rules(){
        return "The objective is get 3 in a row in the case of a board 3x3\n";
    }
}
