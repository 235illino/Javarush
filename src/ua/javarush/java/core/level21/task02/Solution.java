package ua.javarush.java.core.level21.task02;

import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {
        // Обробник тексту: приймає рядок і виводить його у верхньому регістрі.
        // Використовуємо стандартний функціональний інтерфейс Consumer<String>.
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("java");


        // Перевірка роботи обробника на прикладі:

    }
}