package ua.javarush.java.core.level14.task16;

public class Solution {
    public static void main(String[] args) {
        // Створюємо чотирьох студентів, використовуючи кожен із чотирьох конструкторів
        Student full = new Student("Аліса", "Фізика", 95);
        Student noScore = new Student("Борис", "Математика");
        Student nameOnly = new Student("Світлана");
        Student empty = new Student();

        // Виводимо значення всіх полів кожного студента
        printStudent(full);
        printStudent(noScore);
        printStudent(nameOnly);
        printStudent(empty);
    }

    // Невеличкий помічник для наочного виведення всіх полів студента
    private static void printStudent(Student s) {
        System.out.println("Імʼя: " + s.studentName
                + ", Група: " + s.studentGroup
                + ", Бал: " + s.studentScore);
    }
}