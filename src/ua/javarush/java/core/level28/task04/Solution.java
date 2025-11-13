package ua.javarush.java.core.level28.task04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо вкладений список скринь із каменями
        List<List<Integer>> treasureChests = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );

        // Новий список, куди зберемо всі камені у вихідному порядку
        List<Integer> allGems = new ArrayList<>();

        // Проходимо по кожній «скрині» та додаємо її вміст
        for (var list : treasureChests){
            allGems.addAll(list);
        }


        // Виводимо обʼєднаний список
        System.out.println(allGems); // Очікуваний результат: [1, 2, 3, 4, 5, 6]
    }
}