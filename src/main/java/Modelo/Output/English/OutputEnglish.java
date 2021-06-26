package Modelo.Output.English;

import Modelo.Output.Output;

public class OutputEnglish implements Output {
    @Override
    public String finish() {
        return ConcludeGame.finish();
    }

    @Override
    public String finish(String winner) {
        return ConcludeGame.finish(winner);
    }

    @Override
    public String indexOutOfBounds() {
        return Exceptions.indexOutOfBounds();
    }

    @Override
    public String boxIsBusy() {
        return Exceptions.boxIsBusy();
    }

    @Override
    public String passInteger() {
        return Exceptions.passInteger();
    }

    @Override
    public String dataNoValid() {
        return Exceptions.dataNoValid();
    }


    @Override
    public String exit() {
        return FinalMessage.exit();
    }

    @Override
    public String getOption() {
        return MenuMessage.GetOption();
    }

    @Override
    public String OptionStart() {
        return MenuMessage.OptionStart();
    }

    @Override
    public String NoAnOption() {
        return MenuMessage.NoAnOption();
    }

    @Override
    public String OptionName() {
        return MenuMessage.OptionName();
    }

    @Override
    public String OptionSize() {
        return MenuMessage.OptionSize();
    }

    @Override
    public String OptionMode() {
        return MenuMessage.OptionMode();
    }

    @Override
    public String OptionToken() {
        return MenuMessage.OptionToken();
    }

    @Override
    public String OptionLanguage() {
        return MenuMessage.OptionLanguage();
    }

    @Override
    public String OptionExit() {
        return MenuMessage.OptionExit();
    }

    @Override
    public String getName() {
        return MessagesForInput.getName();
    }

    @Override
    public String main() {
        return Presentation.main();
    }

    @Override
    public String getSize() {
        return MessagesForInput.getSize();
    }

    @Override
    public String getToken() {
        return MessagesForInput.getToken();
    }

    @Override
    public String getRow() {
        return MessagesForInput.getRow();
    }

    @Override
    public String getField() {
        return MessagesForInput.getField();
    }

    @Override
    public String getSpanish() {
        return MessagesLanguage.getSpanish();
    }

    @Override
    public String getEnglish() {
        return MessagesLanguage.getEnglish();
    }

    @Override
    public String getVsPlayer() {
        return MessagesChangeRival.getVsPlayer();
    }

    @Override
    public String getVsComputer() {
        return MessagesChangeRival.getVsComputer();
    }

    @Override
    public String getRaffle() {
        return Raffle.getDescription();
    }

    @Override
    public String getRaffleResult(int result) {
        return Raffle.getResult(result);
    }

    @Override
    public String getRaffleWinner(String name) {
        return Raffle.getWinner(name);
    }

}
