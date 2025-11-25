package ua.javarush.java.core.level26.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Map: ключ — назва дня тижня (String), значення — його номер (Integer)
        Map<String, Integer> week = new HashMap<>();
        week.put("Monday", 1);
        week.put("Tuesday", 2);
        week.put("Wednesday", 3);

        week.entrySet().forEach(x -> System.out.println(String.format("День: %s, Номер: %d", x.getKey(), x.getValue())));

        // Додаємо елементи згідно з умовою задачі


        // Проходимо по всіх парах ключ-значення і виводимо у потрібному форматі

    }
}