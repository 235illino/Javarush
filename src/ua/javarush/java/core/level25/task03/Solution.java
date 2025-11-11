package ua.javarush.java.core.level25.task03;

public class Solution {
    public static void main(String[] args) {
        // Викликаємо статичний метод вкладеного класу за повним іменем,
        // не створюючи об’єкт зовнішнього класу Library
        Library.Archive.readParchment();

    }
}