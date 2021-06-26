package Modelo.Output.English;

import Modelo.Input.input;

public class Exceptions extends input {
    public static String indexOutOfBounds(){
        return "The index is out of bounds";
    }
    public static String boxIsBusy(){
        return "This box is busy";
    }
    public static String passInteger(){
        return "The input must be a number";
    }
    public static String dataNoValid(){
        return "The data input is not valid";
    }
}
