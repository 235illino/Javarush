package ua.javarush.java.core.level20.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо універсальний об’єкт, який уміє виконувати обидва контракти
        Sketch sketch = new Sketch();

        // Демонстрація роботи: спочатку малюємо, потім стираємо
        sketch.draw();
        sketch.erase();
    }
}