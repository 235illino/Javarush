package ua.javarush.java.core.level30.task10;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Імпортований список: є дублікати за іменем із різним віком
        List<User> imported = List.of(
                new User("Іван", 23),
                new User("Анна", 19),
                new User("Іван", 28),   // дублікат імені — має бути проігнорований
                new User("Павло", 30),
                new User("Анна", 22),   // дублікат імені — має бути проігнорований
                new User("Єва", 20)
        );
        var uniqueProfiles = imported.stream().collect(Collectors.toMap(
                user -> user.name,
                user -> user,
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new
        )).values().stream().toList();

        // Формуємо "чисту" базу профілів за ім’ям.
        // Collectors.toMap:
        // - ключ: ім’я користувача
        // - значення: сам об’єкт User
        // - при колізії (дублікаті імені) залишаємо перший (first), ігноруємо наступний (ignored)
        // - LinkedHashMap::new — зберігаємо порядок перших появ


        // Підсумкова колекція унікальних профілів


        // Виводимо підсумкову структуру даних
        uniqueProfiles.forEach(System.out::println);
    }

    // Простий клас профілю користувача
    static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            // Наглядне подання профілю: "Ім’я — вік років"
            return name + " — " + age + " років";
        }
    }
}