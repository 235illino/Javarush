package ua.javarush.java.core.level23.task16;

// Точка входу: "наймаємо" програміста і даємо йому завдання
public class Solution {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Аліса");

        // Доручаємо роботу і здачу звіту
        programmer.work();
        programmer.report();
    }
}