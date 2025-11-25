package ua.javarush.java.core.level27.task01;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну палітри через інтерфейс List,
        // а як реалізацію використовуємо LinkedList
        List<String> farbe = new LinkedList<>();
        farbe.add("червоний");
        farbe.add("зелений");
        farbe.add("синій");
        System.out.println(farbe.get(1));


        // Додаємо три кольори до палітри


        // Отримуємо другий елемент (індекс 1) методом get і виводимо його

    }
}