package command.exercise1;

public class Invoker {

    private Command command;

    public void setComand(Command comand) {
        this.command = comand;
    }

    public void executeCommand(){
        command.execute();
    }
}
