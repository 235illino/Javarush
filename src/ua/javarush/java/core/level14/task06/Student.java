package ua.javarush.java.core.level14.task06;

public class Student {
    private String studentName;
    private int studentGrade;

    public Student(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return String.format("Ім’я: %s, оцінка: %d", studentName, studentGrade);
    }
}
