package ua.javarush.java.core.level29.task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два незалежні об’єкти з однаковими значеннями полів
        Employee first = new Employee("Аліса", 123);
        Employee second = new Employee("Аліса", 123);

        // HashMap, де ключем виступає Employee, а значенням — роль
        Map<Employee, String> roles = new HashMap<>();

        // Кладемо в мапу пару (ключ — перший об’єкт, значення — "Працівник")
        roles.put(first, "Працівник");

        // Намагаємося отримати значення за "логічно рівним" ключем (другий об’єкт)
        // Це спрацює лише за коректних equals і hashCode
        String role = roles.get(second);

        // Очікуваний вивід: "Працівник"
        System.out.println(role);
    }
}