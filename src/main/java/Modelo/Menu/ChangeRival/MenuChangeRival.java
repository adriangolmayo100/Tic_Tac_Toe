package Modelo.Menu.ChangeRival;


public enum MenuChangeRival {
    PLAYER(new switchPlayer()),
    COMPUTER(new switchComputer());

    private final Enemy actionPlayer;

    MenuChangeRival(Enemy election){
        this.actionPlayer = election;
    }

    public String getTitle() {
        return actionPlayer.getTitle();
    }

    public static MenuChangeRival getOption(int option){
        return values()[option];
    }
    public static String getMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (MenuChangeRival option : values() ){
            stringBuilder.append(option.ordinal());
            stringBuilder.append("-");
            stringBuilder.append(option.getTitle());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void action(){
        actionPlayer.changeEnemyImplementation();
    }

}
