package command.commands;

import command.BeeBot;

public class Delete implements Command {
    private BeeBot beeBot;

    public Delete(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.remove();
    }
}