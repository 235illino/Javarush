package ua.javarush.java.core.level19.task16;

public abstract class Order {
    private double amount;

    protected Order(double amount) {
        this.amount = amount;
    }

    public abstract void process();

    public double getAmount() {
        return amount;
    }
}
