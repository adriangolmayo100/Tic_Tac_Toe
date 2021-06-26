package Modelo.Menu.ChangeLanguage;


import Modelo.Menu.Application;

public enum MenuChangeLanguage {
    ENGLISH(new English()),
    SPANISH(new Spanish());

    private final Language language;

    MenuChangeLanguage(Language language){
        this.language =language;
    }

    public String getTitle() {
        return language.getTitle();
    }

    public static MenuChangeLanguage getOption(int option){
        return values()[option];
    }
    public static String getMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (MenuChangeLanguage option : values() ){
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
                language.changeLanguage();
                break;
            }
            catch (Exception e){
                System.out.println(Application.getOutput().dataNoValid());
            }
        }
    }
}
