package ua.javarush.java.core.level24.task02;

public class Solution {
    public static void main(String[] args) {
        // Загальний виняток, який можна обробити
        Exception generalSystemIssue = new Exception();
        Error catastrophicFailure = new Error();

        // Фатальна помилка, що вказує на проблему рівня JVM
        System.out.println(generalSystemIssue instanceof Throwable);
        System.out.println(catastrophicFailure instanceof Throwable);

        // Перевіряємо на рівні класів: чи є клас змінної нащадком Throwable


        // Виводимо результат перевірки для кожної змінної

    }
}