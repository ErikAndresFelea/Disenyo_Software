package strategy.exercise4;

import strategy.exercise4.resources.classifiers.*;
import strategy.exercise4.resources.metrics.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("---KNN with Euclian disntace---");
        Context context = new Context(new KNN(new Euclidean()));
        context.run();

        System.out.println("---KNN with Manhattan disntace---");
        context.getClassifierStrategy().setDistanceStrategy(new Manhattan());
        context.run();

        System.out.println("---Kmeans with Manhattan distance---");
        context.setClassifierStrategy(new Kmeans(new Manhattan()));
        context.run();

        System.out.println("---SOM with Euclidean distance---");
        context.setClassifierStrategy(new SOM(new Euclidean()));
        context.run();
    }
}
