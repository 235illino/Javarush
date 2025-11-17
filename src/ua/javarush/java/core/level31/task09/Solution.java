package ua.javarush.java.core.level31.task09;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Створюємо та заповнюємо список абітурієнтів (ім’я + GPA)
        List<Student> candidates = List.of(
                new Student("Аліса", 3.7),
                new Student("Борис", 2.8),
                new Student("Чен", 3.0),
                new Student("Діна", 2.4),
                new Student("Єгор", 4.0)
        );

        // Розділяємо на дві групи за критерієм GPA >= 3.0:
        // - partitioningBy виконує розбиття на true/false
        // - mapping витягує зі Student лише імена (String), збираючи їх у списки

        var result = candidates.stream().collect(Collectors.partitioningBy(cand -> cand.getStudentGpa() >= 3.0, Collectors.mapping(Student::getStudentName, Collectors.toList())));




        // Виводимо отриману мапу: {true=[імена з GPA >= 3.0], false=[інші]}
        System.out.println(result);
    }
}

// Простий клас Student із приватними полями та гетерами
class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentName() {
        return name;
    }

    public double getStudentGpa() {
        return gpa;
    }
}