package ua.javarush.java.core.level25.task02;

public class Solution {
    public static void main(String[] args) {
        // Створюємо кота і передаємо ім’я в конструктор Cat
        Cat cat = new Cat("Мурзик");

        // Перевіримо, що ім’я успішно ініціалізувалося через super(...)
        System.out.println(cat.name);
    }
}