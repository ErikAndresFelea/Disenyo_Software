package strategy.exercise4.resources.classifiers;

import strategy.exercise4.interfaces.ClassifierStrategy;
import strategy.exercise4.interfaces.DistanceStrategy;

public class SOM implements ClassifierStrategy {
    private DistanceStrategy distanceStrategy;

    public SOM(DistanceStrategy distanceStrategy) {
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
        System.out.println("ClassifierSOM executed");
    }
}
