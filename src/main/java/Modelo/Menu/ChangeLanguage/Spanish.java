package Modelo.Menu.ChangeLanguage;

import Modelo.Menu.Application;
import Modelo.Output.Spanish.OutputSpanish;

public class Spanish extends Language{
    @Override
    public void changeLanguage() {
        Application.setOutput(new OutputSpanish());
    }

    @Override
    String getTitle() {
        return Application.getOutput().getSpanish();
    }
}
