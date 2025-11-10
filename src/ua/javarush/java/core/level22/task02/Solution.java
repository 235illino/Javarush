package ua.javarush.java.core.level22.task02;

public class Solution {
    public static void main(String[] args) {
        // Створюємо запис для вигаданого студента
        Student student = new Student("Іван Петров", 20);

        // Спочатку виводимо лише ім’я, потім лише вік — через accessor-методи запису
        System.out.println(student.name()); // метод доступу для компонента name
        System.out.println(student.age());  // метод доступу для компонента age
    }
}