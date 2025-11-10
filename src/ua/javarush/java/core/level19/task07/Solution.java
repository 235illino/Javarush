package ua.javarush.java.core.level19.task07;

// Головний клас із точкою входу
public class Solution {
    public static void main(String[] args) {
        // Створюємо коло з іменем "Коло" і радіусом 2.0
        Circle circle = new Circle("Коло", 2.0);

        // Спочатку виводимо ім’я фігури
        System.out.println(circle.name);

        // Потім виводимо площу кола
        System.out.println(circle.area());
    }
}