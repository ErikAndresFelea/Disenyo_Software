package command.exercise1.commands;
import command.exercise1.BeeBot;
import command.exercise1.Command;

public class Left implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Left(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la izquierda";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
