package command.exercise2;

import command.exercise2.commands.Command;

class Invoker {

    private Command command;

    void setComand(Command comand) {
        this.command = comand;
    }

    void execute() {
        command.execute();
    }
}
