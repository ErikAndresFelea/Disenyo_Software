package command.exercise2.commands;

import command.exercise2.BeeBot;

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
