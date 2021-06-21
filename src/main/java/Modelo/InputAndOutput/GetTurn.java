package Modelo.InputAndOutput;

import java.util.Scanner;

public class GetTurn {
    public static int getField(){
        System.out.print("Give me the colum: ");
        return Integer.parseInt(getData());
    }
    private static String getData(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static int getRow(){
        System.out.print("Give me the row: ");
        return Integer.parseInt(getData());
    }
}
