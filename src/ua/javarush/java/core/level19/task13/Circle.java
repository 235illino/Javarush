package ua.javarush.java.core.level19.task13;


public class Circle extends Shape {
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
