package ua.javarush.java.core.level27.task03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Створюємо словник перекладів: англійське слово -> російський переклад
        Map<String, String> map = new HashMap<>();
        map.put("dog", "собака");
        map.put("cat", "кошка");
        map.put("bird", "птица");

        // Заповнюємо словник трьома парами

        //map.entrySet().forEach(x -> System.out.println(x.getKey() + " = " + x.getValue()));
        for (var x : map.entrySet()) {
            System.out.println(x.getKey() + " = " + x.getValue());
        }

        // Перебираємо пари через for-each по entrySet()
        // (під капотом використовується Iterator, як і вимагається за умовою)

        // Форматований вивід у вигляді "ключ = значення"


    }
}