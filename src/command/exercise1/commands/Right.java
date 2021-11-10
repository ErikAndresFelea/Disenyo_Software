package command.exercise1.commands;
import command.exercise1.BeeBot;
import command.exercise1.Command;

public class Right implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Right(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la derecha";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
