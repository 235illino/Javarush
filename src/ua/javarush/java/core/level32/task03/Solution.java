package ua.javarush.java.core.level32.task03;

import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два незмінних списки з фруктами з двох кошиків
        List<String> firstBasketFruits = List.of("Яблуко", "Груша");
        List<String> secondBasketFruits = List.of("Банан", "Апельсин");

        // Отримуємо потоки з кожної корзини та об’єднуємо їх в один спільний потік
        // Використовуємо Stream.concat згідно з вимогами задачі
        var allSaladIngredients = Stream.concat(firstBasketFruits.stream(), secondBasketFruits.stream());


        // Проходимо об’єднаним потоком і виводимо кожен фрукт на новому рядку
        allSaladIngredients.forEach(System.out::println);
    }
}