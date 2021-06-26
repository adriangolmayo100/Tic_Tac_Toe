package Modelo.Menu.ChangeLanguage;

import Modelo.Menu.Application;
import Modelo.Output.English.OutputEnglish;

public class English extends Language{
    @Override
    public void changeLanguage() {
        Application.setOutput(new OutputEnglish());
    }

    @Override
    String getTitle() {
        return Application.getOutput().getEnglish();
    }
}
