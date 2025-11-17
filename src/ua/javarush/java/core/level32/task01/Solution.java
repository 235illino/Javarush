package ua.javarush.java.core.level32.task01;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Вхідні дані: список груп, у кожної групи — список захоплень
        List<List<String>> studentGroupsAndHobbies = List.of(
                List.of("Плавання", "Шахи"),
                List.of("Футбол"),
                List.of("Програмування", "Читання", "Кіно")
        );

        // flatMap "розплющує" потік списків у потік рядків (хобі),
        // після чого збираємо усе в єдиний List<String>
        var allStudentHobbies = studentGroupsAndHobbies.stream().flatMap(Collection::stream).collect(Collectors.toList());


        // Виводимо підсумковий список на екран
        System.out.println(allStudentHobbies);
    }
}