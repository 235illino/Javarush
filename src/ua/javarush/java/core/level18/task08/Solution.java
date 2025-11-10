package ua.javarush.java.core.level18.task08;

public class Solution {
    public static void main(String[] args) {
        // Створюємо квадрат 5x5 (використовуємо конструктор з одним параметром)
        Rectangle square = new Rectangle(5);

        // Створюємо прямокутник 10x7 (використовуємо конструктор з двома параметрами)
        Rectangle rectangle = new Rectangle(10, 7);

        // Виводимо значення width і height для обох об’єктів (через пробіл)
        System.out.println(square.width + " " + square.height);
        System.out.println(rectangle.width + " " + rectangle.height);
    }
}