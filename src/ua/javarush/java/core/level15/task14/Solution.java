package ua.javarush.java.core.level15.task14;

public class Solution {
    public static void main(String[] args) {
        // Створюємо посвідчення з ім’ям "Аліса"
        StudentIdentityCard card = new StudentIdentityCard("Аліса");

        // Виводимо ім’я студента через ґетер
        System.out.println(card.getStudentName());

        // Спроба змінити ім’я неможлива:
        //card.studentName = "Боб"; // так не можна — поле приватне й final (помилка компіляції)
    }
}