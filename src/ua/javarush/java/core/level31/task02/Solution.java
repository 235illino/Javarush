package ua.javarush.java.core.level31.task02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список студентів (незмінний)
        List<Student> students = List.of(
                new Student("Аліса", 90),
                new Student("Боб", 75),
                new Student("Вася", 100),
                new Student("Катя", 80)
        );

        // 1) Кількість студентів з балом > 80 (використовуємо Stream API)
        var excellentCount = students.stream().filter(stud -> stud.getExamScore() > 80).count();
        System.out.println(excellentCount);

        // 2) Середній бал серед усіх студентів (якщо список порожній — 0.0)
        var averageScore = students.stream().mapToInt(Student::getExamScore).average().orElse(0.0);
        System.out.println(averageScore);

        // 3) Ім’я студента з мінімальним балом
        // Якщо список порожній — нічого не виводимо
        var loser = students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getExamScore)));

        loser.ifPresent(x -> System.out.println(x.getStudentName()));

    }
}

// Простий клас Student з двома полями та ґетерами
class Student {
    private final String studentName;
    private final int examScore;

    public Student(String studentName, int examScore) {
        this.studentName = studentName;
        this.examScore = examScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getExamScore() {
        return examScore;
    }
}