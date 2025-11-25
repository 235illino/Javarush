package ua.javarush.java.core.level18.task03;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну базового типу
        Employee employee;

        // Присвоюємо їй об’єкт підкласу Developer
        employee = new Developer();

        // Поліморфний виклик: виконається перевизначена версія з Developer
        employee.work(); // Очікуване виведення: "Розробник пише код."
    }
}