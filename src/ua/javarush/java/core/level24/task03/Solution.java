package ua.javarush.java.core.level24.task03;

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
        // "Неочікуваний збій": RuntimeException — неперевірюваний (unchecked) виняток
        RuntimeException unexpectedGlitch = new RuntimeException();



        // "Втрачений файл конфігурації": FileNotFoundException — перевірюваний (checked) виняток
        FileNotFoundException missingConfigurationFile = new FileNotFoundException();

        // Виводимо класифікацію винятків
        System.out.println("RuntimeException — unchecked");
        System.out.println("FileNotFoundException — checked");

    }
}