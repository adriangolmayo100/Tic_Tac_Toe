package Modelo.Menu;


import Modelo.Menu.ChangeRival.ChangeRival;
import Modelo.Menu.ChangeLanguage.ChangeLanguage;

public enum Menu {
    START(new GameExecution()),
    NAME(new ChangeName()),
    SIZE(new ChangeSize()),
    MODE(new ChangeRival()),
    TOKEN(new ChangeToken()),
    LANGUAGE(new ChangeLanguage()),
    EXIT(new Exit());

    private final Action action;
    Menu(Action action){
        this.action=action;
    }

    public String getTitle() {
        return action.getTitle();
    }

    public static Menu getOption(int option){
        return values()[option];
    }
    public static String getMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Menu option : values() ){
            stringBuilder.append(option.ordinal());
            stringBuilder.append("-");
            stringBuilder.append(option.getTitle());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void doAction(){
        while (true){
            try {
                action.doAction();
                break;
            }
            catch (Exception e){
                System.out.println(Application.getOutput().dataNoValid());
            }
        }
    }
}
