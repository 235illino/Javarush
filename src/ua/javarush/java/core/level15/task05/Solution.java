package ua.javarush.java.core.level15.task05;

public class Solution {
    public static void main(String[] args) {
        // Створюємо візитку і задаємо ім’я власника
        UserCard card = new UserCard("Еліс");

        // Отримуємо ім’я через ґетер і виводимо на екран
        System.out.println(card.getUserName());
    }
}