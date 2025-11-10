package ua.javarush.java.core.level15.task02;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Person з ім’ям "Анна" і віком 30
        Person person = new Person("Анна", 30);

        // Отримуємо ім’я та вік через гетери й виводимо їх на консоль
        System.out.println("Імʼя: " + person.getMemberName());
        System.out.println("Вік: " + person.getMemberAge());
    }
}