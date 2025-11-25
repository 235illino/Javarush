package ua.javarush.java.core.level26.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Використовуємо інтерфейс List для зберігання назв предметів
        List<String> list = new ArrayList<>();
        list.add("Математика");
        list.add("Фізика");
        list.add("Інформатика");
        list.add(0, "Англійська");
        list.remove("Фізика");
        list.forEach(System.out::println);



        // Додаємо три основні предмети


        // Вставляємо "Англійська" на першу позицію списку


        // Видаляємо предмет "Фізика" з розкладу


        // Виводимо підсумковий розклад: кожен предмет з нового рядка

    }
}