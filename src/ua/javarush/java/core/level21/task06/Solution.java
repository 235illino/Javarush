package ua.javarush.java.core.level21.task06;

import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо «відправника» як Consumer<String>
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello, method reference!");


        // Використовуємо відправника для виведення повідомлення (без прямого виклику System.out.println)

    }
}