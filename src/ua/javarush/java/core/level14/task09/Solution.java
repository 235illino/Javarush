package ua.javarush.java.core.level14.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо нового кота з ім’ям "Барсик" і віком 3 роки (використовуємо "new" і конструктор)
        Cat cat = new Cat("Барсик", 3);
        System.out.println(cat);


        // Виводимо ім’я та вік кота, щоб підтвердити коректність створення об’єкта

    }
}

// Шаблон (клас) кота з полями для імені та віку