package ua.javarush.java.core.level33.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Крок 1. Створюємо звичайний змінний список ArrayList і додаємо три рідкісні книжки
        List<String> rareBooks = new ArrayList<>();
        rareBooks.add("Кодекс Вітрів");
        rareBooks.add("Гримуар Світла");
        rareBooks.add("Хроніки Зоряного Пилу");

        // Крок 2. Створюємо незмінну обгортку поверх вихідного списку.
        // Важливо: unmodifiableList не копіює елементи, а створює "подання" (view) над тим самим ArrayList,
        // тому зберігається посилальний зв’язок із вихідним списком.
        var protectedCatalog = Collections.unmodifiableList(rareBooks);


        // Крок 3. Виводимо вміст захищеного каталогу
        System.out.println("Вміст захищеного каталогу:");
        for (String book : protectedCatalog) {
            System.out.println(book);
        }
    }
}