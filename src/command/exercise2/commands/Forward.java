package command.exercise2.commands;

import command.exercise2.BeeBot;

public class Forward implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Forward(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia delante";
    }

    @Override
    public void execute() {
        beeBot.addMove(movimiento);
    }
}
