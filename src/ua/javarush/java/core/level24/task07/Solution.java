package ua.javarush.java.core.level24.task07;

public class Solution {
    public static void main(String[] args) {
        int userAge = 14;
        int requiredAge = 16;

        try {
            // Намагаємося пройти віковий контроль
            checkRideAge(userAge, requiredAge);
            System.out.println("Ласкаво просимо на атракціон!");
        } catch (InvalidAgeException e) {
            // Показуємо змістовне повідомлення з нашого винятку
            System.out.println("Відмова: " + e.getMessage());
        }
    }

    // Метод, що перевіряє вік і може "кинути" наш виняток
    static void checkRideAge(int age, int minAge) throws InvalidAgeException {
        if (age < minAge) {
            // Демонстрація кидання винятку зі змістовним повідомленням
            throw new InvalidAgeException(
                "Тобі має бути не менше " + minAge + " років для цього атракціону (зараз " + age + ")."
            );
        }
    }
}