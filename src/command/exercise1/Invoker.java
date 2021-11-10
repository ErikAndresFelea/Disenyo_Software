package command.exercise1;
import command.exercise1.commands.Command;

class Invoker {

    private Command command;

    void setComand(Command comand) {
        this.command = comand;
    }

    void execute() {
        command.execute();
    }
}
