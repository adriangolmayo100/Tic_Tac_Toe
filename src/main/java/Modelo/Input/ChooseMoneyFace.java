package Modelo.Input;

public class ChooseMoneyFace extends input{
    public static int getFace(){
        int face = Integer.parseInt(getData());
        if (face > 1)
            throw new IndexOutOfBoundsException();
        return face;
    }


}
