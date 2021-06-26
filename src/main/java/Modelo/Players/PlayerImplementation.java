package Modelo.Players;


public class PlayerImplementation implements Player{
    private String name;
    private Character token='X';
    public PlayerImplementation(){super();}

    @Override
    public boolean isPlayer() {
        return true;
    }

    @Override
    public int[] getMove() {
        return new int[]{};
    }

    @Override
    public char getToken() {
        return token;
    }

    @Override
    public void setTokenPlayer(Character token) {
        this.token=token;
    }


    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
