package ua.javarush.java.core.level15.task10;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт профілю студента з початковим віком (наприклад, 18)
        StudentProfile profile = new StudentProfile(18);

        // Оновлюємо вік до 20 за допомогою сетера
        profile.setStudentAge(20);

        // Виводимо поточний вік, щоб переконатися, що його оновлено
        System.out.println(profile.getStudentAge());
    }
}