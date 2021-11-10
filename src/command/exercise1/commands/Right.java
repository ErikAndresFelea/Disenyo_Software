package command.exercise1.commands;
import command.exercise1.BeeBot;

public class Right implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Right(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la derecha";
    }

    @Override
    public void execute() {
        beeBot.addMove(movimiento);
    }
}
