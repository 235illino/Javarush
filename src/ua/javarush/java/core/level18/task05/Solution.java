package ua.javarush.java.core.level18.task05;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт «розумного» принтера
        MessagePrinter printer = new MessagePrinter();

        // Демонструємо перший варіант методу: друк рядка як є
        printer.printMessage("Привіт, світе!");

        // Демонструємо другий варіант методу: друк суми двох чисел
        printer.printMessage(10, 20);
    }
}