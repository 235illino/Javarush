package ua.javarush.java.core.level31.task08;

// Клас-модель студента для звіту
public class Student {
    private final String studentName;       // Ім’я студента
    private final int studyCourse;          // Курс навчання (наприклад, 1..4)
    private final String studentSpecialty;  // Спеціальність (наприклад, "Інформатика")
    private final double averageGrade;      // Середній бал

    public Student(String studentName, int studyCourse, String studentSpecialty, double averageGrade) {
        this.studentName = studentName;
        this.studyCourse = studyCourse;
        this.studentSpecialty = studentSpecialty;
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudyCourse() {
        return studyCourse;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}