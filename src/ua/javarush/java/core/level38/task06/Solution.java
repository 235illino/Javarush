package ua.javarush.java.core.level38.task06;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;

public class Solution {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("check.txt");

        // 1) Створюємо файл і записуємо в нього тестовий рядок — наш "оригінал"
        Files.createFile(file);
        try(var writer = Files.newBufferedWriter(file)){
            writer.write("Hello world");
        }
        var sha = MessageDigest.getInstance("SHA-256");
        byte[] data = Files.readAllBytes(file);
        byte[] hash = sha.digest(data);
        var str = toHex(hash);
        String control = "це_неправильна_контрольна_сума_12345";
        if(!str.equals(control))
            System.out.println("Файл check.txt пошкоджено! Спробуй відновити з резервної копії.");


        // 2) Обчислюємо SHA-256-хеш вмісту файла за допомогою стандартного класу MessageDigest


        // 3) Порівнюємо із завідомо неправильною контрольною сумою


        // 4) У разі незбігу виводимо попередження

    }

    // Утилітний метод: перетворення масиву байтів у hex-рядок (нижній регістр)
    private static String toHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}