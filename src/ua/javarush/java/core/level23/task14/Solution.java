package ua.javarush.java.core.level23.task14;

public class Solution {
    public static void main(String[] args) {
        // «Полотно» для фігур: масив спільного типу Shape (демонстрація поліморфізму)
        Shape[] canvas = new Shape[2];

        // Додаємо по одному об’єкту кожної конкретної фігури
        canvas[0] = new Circle();
        canvas[1] = new Square();

        // Проходимо масив і поліморфно викликаємо метод printType()
        for (Shape shape : canvas) {
            shape.printType(); // кожна фігура виводить своє ім’я
        }
    }
}