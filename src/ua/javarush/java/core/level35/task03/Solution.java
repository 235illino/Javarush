package ua.javarush.java.core.level35.task03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Path, що вказує на каталог "game_assets"
        Path dir = Paths.get("game_assets");

        // Перевіряємо, чи існує шлях і чи є він каталогом
        if(Files.exists(dir) && Files.isDirectory(dir)){
            System.out.println("Папку game_assets знайдено");
        } else {
            System.out.println("Папку game_assets не знайдено");
        }
//        System.out.println("Чи існує ? " + Files.exists(dir));
//        System.out.println("Це каталог? " + Files.isDirectory(dir));


        // Виводимо однозначний результат

    }
}