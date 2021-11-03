package strategy.exercise4;

import strategy.exercise4.interfaces.ClassifierStrategy;

class Context {
    private ClassifierStrategy classifierStrategy;

    Context(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    ClassifierStrategy getClassifierStrategy() { return this.classifierStrategy; }

    void run() {
        classifierStrategy.run();
    }
}
