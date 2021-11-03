package strategy.exercise4.resources.classifiers;

import strategy.exercise4.interfaces.ClassifierStrategy;
import strategy.exercise4.interfaces.DistanceStrategy;

public class Kmeans implements ClassifierStrategy {
    private DistanceStrategy distanceStrategy;

    public Kmeans(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    public void process() {
        distanceStrategy.process();
    }

    @Override
    public void setDistanceStrategy(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void run() {
        process();
        System.out.println("ClassifierKmeans executed");
    }
}
