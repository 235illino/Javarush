package ua.javarush.java.core.level15.task12;

public class Solution {
    public static void main(String[] args) {
        // Створюємо студента з початковим віком 10
        SchoolStudent student = new SchoolStudent(10);

        // Намагаємося встановити від’ємний вік
        student.setCurrentAge(-5);

        // Перевіряємо, що вік не змінився — виводимо через геттер
        System.out.println(student.getCurrentAge());

        // Встановлюємо коректний вік
        student.setCurrentAge(15);

        // Перевіряємо, що вік оновився
        System.out.println(student.getCurrentAge());
    }
}