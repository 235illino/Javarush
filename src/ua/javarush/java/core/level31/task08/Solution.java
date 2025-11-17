package ua.javarush.java.core.level31.task08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Формуємо список студентів із різними курсами, спеціальностями та середніми балами
        List<Student> students = Arrays.asList(
                new Student("Олексій Смірнов", 1, "Інформатика", 4.5),
                new Student("Марія Іванова", 1, "Математика", 3.9),
                new Student("Павло Павлов", 1, "Фізика", 4.3),
                new Student("Іван Петров", 2, "Інформатика", 4.2),
                new Student("Ольга Кузнєцова", 2, "Фізика", 4.8),
                new Student("Юлія Федорова", 2, "Математика", 4.6),
                new Student("Степан Єгоров", 2, "Математика", 3.7),
                new Student("Сергій Соколов", 3, "Математика", 4.1),
                new Student("Анна Алексєєва", 3, "Інформатика", 5.0),
                new Student("Микита Романов", 3, "Фізика", 4.9),
                new Student("Дмитро Орлов", 4, "Фізика", 3.7),
                new Student("Катерина Нік.", 4, "Інформатика", 4.0), // граничне значення, не відмінник
                new Student("Єгор Лебедєв", 4, "Математика", 3.5)
        );

        // Вкладене групування:
        // 1) Спочатку за курсом (studyCourse),
        // 2) потім усередині курсу — за спеціальністю (studentSpecialty),
        // 3) як лічильник використовуємо підсумовування 1/0 залежно від умови "averageGrade > 4.0".
        // Такий прийом (summingLong з тернарним оператором) простий і працює в Java 8+,
        // при цьому в мапі залишаються і підгрупи з нулем відмінників.
        var report = students.stream().collect(Collectors.groupingBy(Student::getStudyCourse,
                Collectors.groupingBy(Student::getStudentSpecialty,
                        Collectors.summingLong(s -> s.getAverageGrade() > 4.0 ? 1L : 0L))));

        report.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // сортуємо курси за зростанням для стабільного виводу
                .forEach(courseEntry -> {
                    int course = courseEntry.getKey();
                    System.out.println("Курс " + course + ":");
                    courseEntry.getValue().entrySet().stream()
                            .sorted(Map.Entry.comparingByKey()) // сортуємо спеціальності за абеткою
                            .forEach(specEntry -> {
                                String specialty = specEntry.getKey();
                                long count = specEntry.getValue();
                                System.out.println("  " + specialty + " — відмінників: " + count);
                            });
                });

        // Гарно виводимо звіт: для кожного курсу та кожної спеціальності — кількість відмінників


    }
}