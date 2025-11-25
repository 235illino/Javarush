package ua.javarush.java.core.level33.task03;

import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список чисел від 1 до 5
        List<Integer> foods = List.of(1, 2, 3, 4, 5);

        // Будуємо ледачий Stream-ланцюжок: filter -> map.
        // Усередині лямбд є println, але вони НЕ виконаються без термінальної операції.
        foods.stream().filter(x -> {
            System.out.println("Кіт розмірковує про їжу " + x);
            return x > 1;
        }
        ).map(x -> {
            System.out.println("Кіт уявляє смак " + x);
            return x;
        });
    }
}