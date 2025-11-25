package ua.javarush.java.core.level38.task05;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // Читаємо бінарний файл за допомогою DataInputStream
        try (var read = new DataInputStream(new FileInputStream("numbers.bin"))){
            for (int i = 0; i < 4; i++) {
                System.out.println(read.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Файл неочікувано закінчився! Можливо, він пошкоджений.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}