package command.exercise1.commands;
import command.exercise1.BeeBot;
import command.exercise1.Command;

public class Forward implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Forward(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia delante";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
