package Modelo.Output.English;

public class Raffle {
    public static String getDescription(){
        return "You have to choose between Head or Tail to decide who beginning\nHead:0\nTail:1";
    }
    public static String getResult(int result){
        if (result==0)
            return "The result is: Head";
        return "The result is: Tail";
    }
    public static String getWinner(String winner){
        return "The winner is: " + winner;
    }
}
