package ua.javarush.java.core.level32.task10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Створюємо "сувій" — потік рядків із трьох заклинань
        Stream<String> spells = Stream.of("one", "two", "three");

        // Перша термінальна операція: переписуємо заклинання у список (магічну книгу)
        var list = spells.collect(Collectors.toList());
        try {
            var count = spells.count();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Друга термінальна операція над тим самим потоком — заборонена:
        // Потоки в Java одноразові. Повторне читання призведе до IllegalStateException.

    }
}