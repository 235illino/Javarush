package ua.javarush.java.core.level17.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкти яблука та банана
        Apple apple = new Apple();
        Banana banana = new Banana();

        // Задаємо кольори для кожного фрукта (поле успадковано від Fruit)
        apple.fruitColor = "червоний";
        banana.fruitColor = "жовтий";

        // Виводимо колір кожного фрукта
        apple.printColor();
        banana.printColor();
    }
}

