package ua.javarush.java.core.level37.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Шлях до "давнього сувою" — UTF-8 файл із не-ASCII символами
        Path ancientScrollPath = Paths.get("ancient_scroll.txt");

        // "Хибна лінза": навмисно вказуємо кодування ISO-8859-1
        Charset decryptionCharset = StandardCharsets.ISO_8859_1;

        // Сюди збережемо результат читання при розшифруванні хибним кодуванням
        String decodedContent = "";
        // Поля для інформації про помилку, якщо вона станеться
        String exceptionType = "";
        String errorMessage = "";
        // Намагаємось прочитати UTF-8 файл як ISO-8859-1 через Files.newBufferedReader
        // Якщо під час читання щось пішло не так — повідомляємо про це
        try (var in = Files.newBufferedReader(ancientScrollPath, decryptionCharset)) {
            decodedContent = in.readLine();
            System.out.println(decodedContent);
        } catch (IOException e) {
            exceptionType = e.getClass().getTypeName();
            errorMessage = e.getMessage();
            System.out.println(exceptionType);
            System.out.println(errorMessage);
        }


    }
}