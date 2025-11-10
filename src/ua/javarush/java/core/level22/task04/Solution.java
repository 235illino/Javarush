package ua.javarush.java.core.level22.task04;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Колекція, де ключ — користувач (record), значення — рядкова роль
        Map<User, String> roles = new HashMap<>();

        // Додаємо кількох користувачів з унікальними ідентифікаторами та ролями
        roles.put(new User("Аліса", 1L), "адміністратор");
        roles.put(new User("Боб", 2L), "модератор");
        roles.put(new User("Єва", 3L), "гість");

        // Створюємо новий об’єкт користувача з тими самими даними, що й у вже доданого
        User lookup = new User("Боб", 2L);

        // Шукаємо його роль: HashMap використовує equals/hashCode, які в record генеруються за компонентами
        String role = roles.get(lookup);

        // Виводимо знайдену роль на екран
        System.out.println(role);
    }
}