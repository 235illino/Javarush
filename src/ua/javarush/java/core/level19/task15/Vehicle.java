package ua.javarush.java.core.level19.task15;

public abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void move();
}
