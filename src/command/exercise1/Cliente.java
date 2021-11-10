package command.exercise1;

import command.exercise1.commands.*;

public class Cliente {
    public static void main(String[] args) {

        BeeBot beeBot = new BeeBot();

        Invoker invoker = new Invoker();
        invoker.setComand(new Forward(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Back(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Right(beeBot));
        invoker.executeCommand();

        invoker.setComand(new Left(beeBot));
        invoker.executeCommand();
    }
}
