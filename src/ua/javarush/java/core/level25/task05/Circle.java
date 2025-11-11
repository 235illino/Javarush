package ua.javarush.java.core.level25.task05;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int calculateSurface() {
        return (int) (radius*radius*Math.PI);
    }
}
