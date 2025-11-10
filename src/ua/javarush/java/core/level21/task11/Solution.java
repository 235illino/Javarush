package ua.javarush.java.core.level21.task11;

public class Solution {
    public static void main(String[] args) {
        // Створюємо конкретну реалізацію інтерфейсу Printer
        ConsolePrinter printer = new ConsolePrinter();

        // Викликаємо default-метод інтерфейсу, який виводить повідомлення двічі
        printer.printTwice("Java");
    }
}