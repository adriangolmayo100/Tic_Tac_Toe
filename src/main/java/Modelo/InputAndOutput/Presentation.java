package Modelo.InputAndOutput;

public class Presentation {
    public static String main(){
        return begining() +
                rules();
    }
    private static String begining(){
        return "Welcome to the game Tic Tac Toe\n";
    }
    private static String rules(){
        return "The objective is get 3 in a row in the case of a board 3x3\n";
    }
}
