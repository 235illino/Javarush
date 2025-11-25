package ua.javarush.java.core.level18.task11;

public class Solution {
    public static void main(String[] args) {
        // Демонстрація поліморфізму: змінна типу Shape вказує на об’єкт Circle
        Shape shape = new Circle();

        // Виклик перевизначеного методу: має вивести "Малюємо коло"
        shape.draw();
    }
}