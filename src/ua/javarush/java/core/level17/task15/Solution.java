package ua.javarush.java.core.level17.task15;

public class Solution {
    public static void main(String[] args) {
        // Створюємо найбільш специфічний тип в ієрархії — школяра
        SchoolStudent schoolStudent = new SchoolStudent();

        // Викликаємо перевизначений метод introduce()
        // Очікуваний вивід: "Я школяр."
        schoolStudent.introduce();
    }
}