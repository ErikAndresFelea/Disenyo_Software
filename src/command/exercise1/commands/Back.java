package command.exercise1.commands;
import command.exercise1.BeeBot;
import command.exercise1.Command;

public class Back implements Command {

    private BeeBot beeBot;
    private String movimiento;

    public Back(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia atrás";
    }

    @Override
    public void execute() {
        beeBot.mover(movimiento);
    }
}
