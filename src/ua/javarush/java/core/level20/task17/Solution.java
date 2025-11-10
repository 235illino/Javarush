package ua.javarush.java.core.level20.task17;

public class Solution {
    public static void main(String[] args) {
        // Демонстрація гнучкості: дві реалізації одного інтерфейсу
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        String testMessage = "Тестове повідомлення";

        // Викликаємо обох однаково, але поведінка різна
        consoleLogger.log(testMessage);              // Виведе: Тестове повідомлення
        fileLogger.log(testMessage);                 // Виведе: Журнал записано у файл: Тестове повідомлення
    }
}