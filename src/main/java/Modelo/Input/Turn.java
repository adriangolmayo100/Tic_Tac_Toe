package Modelo.Input;

import Modelo.Input.input;

public class Turn extends input {
    public static int getField(){
        return Integer.parseInt(getData()) - 1;
    }

    public static int getRow(){
        return Integer.parseInt(getData()) - 1;
    }
}