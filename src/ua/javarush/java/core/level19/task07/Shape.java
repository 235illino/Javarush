package ua.javarush.java.core.level19.task07;

public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
}
