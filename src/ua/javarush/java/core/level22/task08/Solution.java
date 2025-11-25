package ua.javarush.java.core.level22.task08;

// Демонстрація: record незмінний за структурою, але може зберігати посилання на змінюваний масив.
public class Solution {
    public static void main(String[] args) {
        // Створюємо вихідний масив показань датчиків
        int[] readings = {10, 20, 30};

        // Передаємо масив в об’єкт record (зберігається те саме посилання на масив)
        IntArrayRecord container = new IntArrayRecord(readings);

        // Змінюємо перший елемент вихідного масиву
        readings[0] = 99;

        // Беремо перший елемент із масиву всередині record і виводимо його
        System.out.println(container.values()[0]); // очікуваний вивід: 99
    }
}