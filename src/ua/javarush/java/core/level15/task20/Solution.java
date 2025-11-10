package ua.javarush.java.core.level15.task20;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт через "швидку" реєстрацію (без параметрів).
        // Спочатку спрацює нестатичний блок (тимчасовий ID), потім повідомлення конструктора.
        UserProfile fastRegistration = new UserProfile();

        // Створюємо об’єкт через "повну" реєстрацію з ім’ям "Дар’я".
        // Знову спочатку спрацює блок ініціалізації, потім конструктор із параметром.
        UserProfile fullRegistration = new UserProfile("Дар’я");
    }
}