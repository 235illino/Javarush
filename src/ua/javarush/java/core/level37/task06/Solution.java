package ua.javarush.java.core.level37.task06;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

public class Solution {
    public static void main(String[] args) {
        // Отримуємо від JVM усі доступні кодування.
        // Метод повертає відсортовану мапу: ключ — канонічне (офіційне) ім’я, значення — об’єкт Charset.
        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();

        // Перебираємо всі елементи мапи (усі кодування, які підтримує JVM)
        stringCharsetSortedMap.forEach((k,v) -> System.out.println(k));


    }
}