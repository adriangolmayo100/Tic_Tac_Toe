package Modelo.Input;

import java.util.Scanner;

public abstract class input {
    protected static String getData(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
