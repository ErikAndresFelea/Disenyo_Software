package command;

import command.commands.Command;

class Invoker {

    private Command command;

    void setComand(Command comand) {
        this.command = comand;
    }

    void execute() {
        command.execute();
    }
}
