package command.exercise2.commands;

import command.exercise2.BeeBot;

public class Left implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Left(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la izquierda";
    }

    @Override
    public void execute() {
        beeBot.addMove(movimiento);
    }
}
