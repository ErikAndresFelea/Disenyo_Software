package command.exercise2.commands;

import command.exercise2.BeeBot;

public class Delete implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Delete(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.remove();
    }
}