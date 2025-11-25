package ua.javarush.java.core.level36.task07;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = "секретне_послання.bin";

        // Дані, які будемо "кодувати" (записувати у бінарний файл)
        int code = 100;
        double decimalId = 3.14;
        boolean confirmation = true;

        // Запис у бінарний файл за допомогою DataOutputStream
        // ВАЖЛИВО: зберігаємо точний порядок запису: int -> double -> boolean
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))){
            out.writeInt(code);
            out.writeDouble(decimalId);
            out.writeBoolean(confirmation);
        }


        // Читання з бінарного файлу за допомогою DataInputStream
        // ВАЖЛИВО: читаємо в тому самому порядку, що й записували, інакше дані будуть інтерпретовані невірно
        int readCode;
        double readDecimalId;
        boolean readConfirmation;
        try(DataInputStream in = new DataInputStream(new FileInputStream(fileName))){
            readCode = in.readInt();
            readDecimalId = in.readDouble();
            readConfirmation = in.readBoolean();
        }

        // Виводимо прочитані значення для підтвердження успішної "декодування"
        System.out.println("Повідомлення успішно прочитано:");
        System.out.println("Кодове число: " + readCode);
        System.out.println("Десятковий ідентифікатор: " + readDecimalId);
        System.out.println("Булеве підтвердження: " + readConfirmation);
    }
}