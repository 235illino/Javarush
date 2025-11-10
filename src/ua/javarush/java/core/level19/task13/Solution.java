package ua.javarush.java.core.level19.task13;

public class Solution {
    public static void main(String[] args) {
        // Створюємо коло радіуса 2.0
        Circle circle = new Circle(2.0);

        // Виводимо площу. Очікуємо побачити 12.56
        System.out.println(circle.area());
    }
}