package ua.javarush.java.core.level26.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо динамічний список (реалізація ArrayList) для зберігання назв фруктів
        List<String> fruits = new ArrayList<>();
        fruits.add("Яблуко");
        fruits.add("Банан");
        fruits.add("Груша");

        // Додаємо фрукти у заданому порядку
        System.out.println(fruits.toString());


        // Виводимо весь список: метод toString() у колекції показує всі елементи

    }
}