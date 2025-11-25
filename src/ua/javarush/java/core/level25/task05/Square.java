package ua.javarush.java.core.level25.task05;

public class Square extends Shape {
    @Override
    int calculateSurface() {
        return sideLength * sideLength;
    }

    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
}
