package ua.javarush.java.core.level14.task04;

public class Student {
    private String studentName;
    private int enrollmentYear;

    public Student(String studentName, int enrollmentYear) {
        this.studentName = studentName;
        this.enrollmentYear = enrollmentYear;
    }

    @Override
    public String toString() {
        return String.format("Ім’я: %s, рік вступу: %d", studentName, enrollmentYear);
    }
}
