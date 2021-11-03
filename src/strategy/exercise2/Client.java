package strategy.exercise2;

import strategy.exercise2.Classifiers.KNN;
import strategy.exercise2.Classifiers.Kmeans;
import strategy.exercise2.Classifiers.SOM;

public class Client {
    public static void main(String[] args) {
        System.out.println("---KNN---");
        Context context = new Context(new KNN());
        context.run();

        System.out.println("---Kmeans---");
        context.setClassifierStrategy(new Kmeans());
        context.run();

        System.out.println("---SOM---");
        context.setClassifierStrategy(new SOM());
        context.run();
    }
}
