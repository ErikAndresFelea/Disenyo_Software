package strategy.exercise4.resources.metrics;

import strategy.exercise4.interfaces.DistanceStrategy;

public class Euclidean implements DistanceStrategy {
    @Override
    public void process() {
        System.out.println("DistanceEuclidean computed");
    }
}
