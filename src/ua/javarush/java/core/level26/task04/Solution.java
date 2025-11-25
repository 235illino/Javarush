package ua.javarush.java.core.level26.task04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо динамічний список (ArrayList) для назв фільмів
        List<String> films = new ArrayList<>();
        films.add("Титанік");
        films.add("Матриця");
        films.add("Інтерстеллар");
        films.add("Матриця");
        System.out.println(films.indexOf("Матриця"));
        System.out.println(films.contains("Аватар"));
        films.clear();
        System.out.println(films);


        // Додаємо фільми до списку



        // помилково додали знову

        // Шукаємо перше входження "Матриця"


        // Перевіряємо наявність "Аватар" у списку
        // contains повертає true/false


        // Очищаємо список


        // Виводимо вміст списку після очищення — має бути порожнім: []

    }
}