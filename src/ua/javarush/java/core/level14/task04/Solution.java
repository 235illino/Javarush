package ua.javarush.java.core.level14.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два об’єкти Student і одразу ініціалізуємо їхні поля через конструктор
        Student st1 = new Student("Анна", 2022);
        Student st2 = new Student("Іван", 2023);
        System.out.println(st1);
        System.out.println(st2);


        // Виводимо інформацію про кожного студента у заданому форматі

    }
}

// Клас-форма для студента: зберігає ім’я та рік вступу