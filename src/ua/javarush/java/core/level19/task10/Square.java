package ua.javarush.java.core.level19.task10;

public class Square extends Figure{


    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
