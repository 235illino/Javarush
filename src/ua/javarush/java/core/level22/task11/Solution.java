package ua.javarush.java.core.level22.task11;

public class Solution {
    public static void main(String[] args) {
        // Створюємо користувача з довільними даними
        UserProfile user = new UserProfile("Аліса", 25);

        // Друкуємо об’єкт — буде викликано наш перевизначений toString()
        System.out.println(user);
    }
}