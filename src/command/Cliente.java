package command;

import command.commands.*;

public class Cliente {
    public static void main(String[] args) {

        BeeBot beeBot = new BeeBot();

        Invoker invoker = new Invoker();
        invoker.setComand(new Forward(beeBot));
        invoker.execute();

        invoker.setComand(new Backward(beeBot));
        invoker.execute();

        invoker.setComand(new Delete(beeBot));
        invoker.execute();

        invoker.setComand(new Right(beeBot));
        invoker.execute();

        invoker.setComand(new Left(beeBot));
        invoker.execute();

        invoker.setComand(new Go(beeBot));
        invoker.execute();

        System.out.println("\n");

        invoker.setComand(new Backward(beeBot));
        invoker.execute();

        invoker.setComand(new Right(beeBot));
        invoker.execute();

        invoker.setComand(new Delete(beeBot));
        invoker.execute();

        invoker.setComand(new Left(beeBot));
        invoker.execute();

        invoker.setComand(new Go(beeBot));
        invoker.execute();
    }
}
