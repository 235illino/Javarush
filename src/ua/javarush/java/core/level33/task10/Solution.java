package ua.javarush.java.core.level33.task10;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Створюємо екземпляр нашого власного Collector
        Collector<String, Map<Integer, List<String>>, Map<Integer, List<String>>> byLength =
                new GroupByLengthCollector();

        // Застосовуємо колектор до потоку рядків
        Map<Integer, List<String>> result = Stream.of("cat", "dog", "lion", "bat", "tiger")
                .collect(byLength);

        // Виводимо результат на екран
        System.out.println(result); // Очікувано: {3=[cat, dog, bat], 4=[lion], 5=[tiger]}
    }
}