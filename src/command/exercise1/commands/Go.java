package command.exercise1.commands;

import command.exercise1.BeeBot;

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
