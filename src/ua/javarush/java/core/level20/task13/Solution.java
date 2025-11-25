package ua.javarush.java.core.level20.task13;

public class Solution {
    public static void main(String[] args) {
        // Створюємо змінну типу інтерфейсу і присвоюємо їй лямбда-вираз,
        // що просто виводить отримане повідомлення
        MessagePrinter printer = message -> System.out.println(message);

        // Викликаємо метод і виводимо повідомлення на екран
        printer.print("Привіт, Java!");
    }
}