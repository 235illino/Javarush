package ua.javarush.java.core.level39.task09;

import java.io.File;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Читаємо рядок зі шляхом до файлу
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        File target = new File(path);

        // Явно перевіряємо існування для наочності:
        // якщо файлу немає, усі права вважаємо false.
        boolean exists = target.exists();

        // Системні перевірки прав доступу (java.io.File):
        boolean readable = exists && target.canRead();
        boolean writable = exists && target.canWrite();
        boolean executable = exists && target.canExecute();

        // Три рядки результату у потрібному форматі й порядку
        System.out.println("Readable: " + readable);
        System.out.println("Writable: " + writable);
        System.out.println("Executable: " + executable);


    }
}