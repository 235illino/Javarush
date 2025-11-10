package ua.javarush.java.core.level21.task15;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт і викликаємо метод за замовчуванням як метод екземпляра
        NumberPrinter printer = new NumberPrinter();
        printer.printSquare(5); // вивід: 25

        // Викликаємо статичний метод інтерфейсу безпосередньо через ім’я інтерфейсу
        MathHelper.printCube(3); // вивід: 27
    }
}