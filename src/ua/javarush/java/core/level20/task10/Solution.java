package ua.javarush.java.core.level20.task10;

import java.io.Serializable;

public class Solution {
    public static void main(String[] args) {
        // Створюємо користувача з довільним ім’ям
        User user = new User("Аліса");

        // Отримуємо ім’я через метод getName() і виводимо на екран
        System.out.println(user.getName());
    }
}