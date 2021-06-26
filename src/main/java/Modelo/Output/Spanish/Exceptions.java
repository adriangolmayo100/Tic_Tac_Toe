package Modelo.Output.Spanish;

import Modelo.Input.input;

public class Exceptions extends input {
    public static String indexOutOfBounds(){
        return "El número pasado está fuera de rango";
    }
    public static String boxIsBusy(){
        return "Esa casilla está ocupada";
    }
    public static String passInteger(){
        return "La entrada debe ser un número";
    }
    public static String dataNoValid(){
        return "La entrada no es válida";
    }
}
