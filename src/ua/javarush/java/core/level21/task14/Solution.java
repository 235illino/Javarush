package ua.javarush.java.core.level21.task14;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт ConsolePrinter
        Printer printer = new ConsolePrinter();

        // Використовуємо статичний метод інтерфейсу для виведення привітання
        Printer.printHello(printer);
    }
}