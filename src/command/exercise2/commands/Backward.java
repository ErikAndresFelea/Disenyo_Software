package command.exercise2.commands;

import command.exercise2.BeeBot;

public class Backward implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Backward(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia atrás";
    }

    @Override
    public void execute() {
        beeBot.addMove(movimiento);
    }
}
