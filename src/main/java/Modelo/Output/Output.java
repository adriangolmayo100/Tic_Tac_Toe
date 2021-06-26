package Modelo.Output;

public interface Output {
    String finish();
    String finish(String winner);
    String indexOutOfBounds();
    String boxIsBusy();
    String passInteger();
    String dataNoValid();
    String exit();
    String getOption();
    String OptionStart();
    String NoAnOption();
    String OptionName();
    String OptionSize();
    String OptionMode();
    String OptionToken();
    String OptionLanguage();
    String OptionExit();
    String getName();
    String main();
    String getSize();
    String getToken();
    String getRow();
    String getField();
    String getSpanish();
    String getEnglish();
    String getVsPlayer();
    String getVsComputer();
    String getRaffle();
    String getRaffleResult(int result);
    String getRaffleWinner(String name);
}
