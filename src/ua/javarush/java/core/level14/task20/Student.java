package ua.javarush.java.core.level14.task20;

public class Student {
    public int studentGrade = 1;
    {
        System.out.printf("Блок 1: grade = %d\n", studentGrade);
        studentGrade = 5;
    }
    {
        System.out.printf("Блок 2: grade = %d\n", studentGrade);
    }
}
