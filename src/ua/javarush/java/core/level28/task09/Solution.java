package ua.javarush.java.core.level28.task09;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Створюємо LinkedHashMap із "порядком за зверненням" (accessOrder = true).
        Map<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.get("b");
        map.keySet().forEach(System.out::println);

        // Додаємо товари: ключ — код товару, значення — його id


        // Імітація перегляду товару "b": доступ через get переносить "b" у кінець


        // Виводимо ключі в поточному порядку обходу: очікується a, c, b

    }
}