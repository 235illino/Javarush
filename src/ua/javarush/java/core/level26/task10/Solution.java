package ua.javarush.java.core.level26.task10;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо "універсальну скриню" для рядків
        UniversalChest<String> messageChest = new UniversalChest<>();
        messageChest.put("Таємне послання: «Хай Java буде з тобою!»");

        // Створюємо "універсальну скриню" для цілих чисел
        UniversalChest<Integer> numberChest = new UniversalChest<>();
        numberChest.put(777); // магічне число

        // Вилучаємо вміст скринь
        String secretMessage = messageChest.take();
        Integer magicNumber = numberChest.take();

        // Виводимо вміст на екран
        System.out.println(secretMessage);
        System.out.println(magicNumber);
    }
}

// Універсальна скриня: узагальнений клас, здатний зберігати об’єкт будь-якого типу T
class UniversalChest<T> {
    // Приватне поле для зберігання "скарбу" типу T
    private T t;


    // Метод для розміщення предмета в скриню
    public void put(T item) {
        this.t = item;
    }

    // Метод для вилучення предмета зі скрині
    // Повертає предмет і «спорожнює» скриню, щоб підкреслити ідею вилучення
    public T take() {
        var temp = this.t;
        t = null;
        return temp;
    }
}