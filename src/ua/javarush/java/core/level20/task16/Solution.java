package ua.javarush.java.core.level20.task16;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реалізація: перетворює рядок у нижній регістр
        StringTransformer stringTransformer = String::toLowerCase;

        // Викликаємо default-метод для рядка "JAVA ROCKS"
        stringTransformer.printTransformed("JAVA ROCKS");

    }
}