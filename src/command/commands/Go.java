package command.commands;

import command.BeeBot;

public class Go implements Command {
    private BeeBot beeBot;

    public Go(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.execute();
    }
}
