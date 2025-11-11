package ua.javarush.java.core.level25.task05;

public class Solution {
    public static void main(String[] args) {
        Shape shape; // Змінна базового типу (поліморфізм)

        // Один і той самий тип посилання вказує на різні об’єкти і викликає "власну" реалізацію
        shape = new Square(5); // квадрат зі стороною 5
        System.out.println("Площа квадрата: " + shape.calculateSurface());

        shape = new Circle(3); // коло з радіусом 3
        System.out.println("Площа кола: " + shape.calculateSurface());
    }
}