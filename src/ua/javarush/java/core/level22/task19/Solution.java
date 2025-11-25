package ua.javarush.java.core.level22.task19;

public class Solution {
    public static void main(String[] args) {
        // Створюємо документ із довільним текстовим вмістом
        Printable doc = new Document("Привіт із record-класу!");

        // Демонстрація роботи: друк вмісту документа
        doc.print();
    }
}