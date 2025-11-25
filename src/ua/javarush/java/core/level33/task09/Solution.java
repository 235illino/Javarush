package ua.javarush.java.core.level33.task09;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class Solution {
    public static void main(String[] args) {
        // Початковий масив «сувоїв» з назвами мов
        String[] languages = {"Java", "Python", "C++", "Kotlin"};

        // Створюємо наш кастомний Spliterator для всього діапазону масиву
        Spliterator<String> spliterator = new ArrayStringSpliterator(languages, 0, languages.length);

        // Створюємо паралельний стрім на базі нашого Spliterator і виводимо елементи
        // Порядок не гарантується, проте кожен елемент буде виведено рівно один раз
        StreamSupport.stream(spliterator, true)
                .forEach(System.out::println);
    }
}