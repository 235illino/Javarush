package ua.javarush.java.core.level17.task19;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Student.
        // Порядок виведення:
        // 1) Спочатку спрацює конструктор Person (через super), далі
        // 2) Конструктор Student.
        Student elena = new Student("Олена");
    }
}