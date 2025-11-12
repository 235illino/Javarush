package ua.javarush.java.core.level26.task02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Створюємо "картотеку" студентів: ключ — ім’я (String), значення — вік (Integer)
        Map<String, Integer> map = new HashMap<>();
        map.put("Іван", 20);
        map.put("Марія", 21);
        map.put("Олексій", 19);

        // Додаємо три записи про студентів
        System.out.println(map.toString());


        // Виводимо повний список усіх студентів і їхнього віку

    }
}