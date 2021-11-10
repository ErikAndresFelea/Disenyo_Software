package command.exercise2;

import java.util.LinkedList;

public class BeeBot {

    private LinkedList<String> fifo = new LinkedList<>();

    public void addMove(String movimiento){
        fifo.add(movimiento);
    }

    public void execute() {
        for (String s : fifo) System.out.println(s);
    }

    public void remove() {
        fifo.remove(fifo.size() - 1);
    }
}
