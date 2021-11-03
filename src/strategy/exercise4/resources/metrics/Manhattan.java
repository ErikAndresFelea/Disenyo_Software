package strategy.exercise4.resources.metrics;

import strategy.exercise4.interfaces.DistanceStrategy;

public class Manhattan implements DistanceStrategy {
    @Override
    public void process() {
        System.out.println("DistanceManhattan computed");
    }
}
