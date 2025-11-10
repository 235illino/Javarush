package ua.javarush.java.core.level23.task02;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну посилального типу Book
        Book libraryBook = null;
        libraryBook.getTitle();


        // Намагаємося звернутися до методу на null-посиланні.
        // Під час виконання це призведе до NullPointerException.

    }
}