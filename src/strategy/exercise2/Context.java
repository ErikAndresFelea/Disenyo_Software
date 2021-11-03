package strategy.exercise2;

class Context {
    private ClassifierStrategy classifierStrategy;

    Context(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    void run() {
        classifierStrategy.run();
    }
}
