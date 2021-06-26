package Modelo.Input;

import Modelo.Input.input;

public class Token extends input {
    public static Character GetToken(){
        String token = getData();
        if (token.length() > 1)
            throw new IllegalArgumentException();
        return token.charAt(0);
    }
}
