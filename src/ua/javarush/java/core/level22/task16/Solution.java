package ua.javarush.java.core.level22.task16;

public class Solution {
    public static void main(String[] args) {
        // Створюємо коректну транзакцію та виводимо її опис
        Transaction ok = new Transaction("Іван Петров", "Марія Смірнова", 12500.75);
        System.out.println(ok.describe());

        // Пробуємо створити транзакцію з від’ємною сумою.
        // Виняток навмисно не перехоплюємо, щоб програма завершилася з помилкою,
        // демонструючи роботу валідації.
        Transaction bad = new Transaction("Іван Петров", "Марія Смірнова", -100.0);

        // Цей код не виконається через виняток вище:
        System.out.println(bad.describe());
    }
}