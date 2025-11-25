package ua.javarush.java.core.level18.task10;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт дочірнього класу
        ColorPrinter printer = new ColorPrinter();

        // Демонстрація: перевантаження у базовому класі + перевизначення в дочірньому
        printer.print(5);        // буде викликано метод Printer#print(int)
        printer.print("Hello");  // буде викликано перевизначений метод ColorPrinter#print(String)
    }
}