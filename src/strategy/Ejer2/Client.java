package strategy.Ejer2;

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
