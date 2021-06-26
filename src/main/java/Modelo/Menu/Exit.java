package Modelo.Menu;


public class Exit extends Action{
    @Override
    public void doAction() {
        System.out.println(Application.getOutput().exit());
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionExit();
    }
}
