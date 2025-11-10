package ua.javarush.java.core.level20.task19;

public class Greeter {
    private GreetingStrategy strategy;

    public GreetingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public void greet(String name) {
        strategy.greet(name);
    }
}
