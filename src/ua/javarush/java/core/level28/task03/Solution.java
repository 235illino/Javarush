package ua.javarush.java.core.level28.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список студентів і наповнюємо його об’єктами Student з іменами
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван"));
        students.add(new Student("Марія"));
        students.add(new Student("Петро"));

        // Створюємо новий список для зберігання лише імен студентів
        List<String> names = new ArrayList<>();
        for (var stud : students){
            names.add(stud.getStudentName());
        }

        // Перетворюємо кожен об’єкт Student на рядок з ім’ям і додаємо до списку names

        

        // Виводимо на екран список імен у форматі [Іван, Марія, Петро]
        System.out.println(names);
    }
}

// Клас Student з єдиним полем studentName і конструктором для ініціалізації
class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    // Ґетер для отримання імені студента
    public String getStudentName() {
        return studentName;
    }
}