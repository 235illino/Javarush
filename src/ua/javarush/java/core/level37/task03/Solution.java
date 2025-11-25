package ua.javarush.java.core.level37.task03;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Повідомлення кирилицею та ім’я файлу з умови
        String secretCyrillicMessage = "Привіт, світе!";
        String failFileName = "latin1fail.txt";

        // Готуємо енкодер ISO-8859-1 і налаштовуємо, щоб при несумісних символах кидався виняток
        CharsetEncoder encoder = StandardCharsets.ISO_8859_1
                .newEncoder()
                .onMalformedInput(CodingErrorAction.REPORT)      // некоректні послідовності
                .onUnmappableCharacter(CodingErrorAction.REPORT); // несумісні символи (наприклад, кирилиця)

        try {
            // 1) Спочатку пробуємо закодувати рядок повністю.
            // Якщо символи не можна подати в ISO-8859-1, буде кинуто CharacterCodingException.
            ByteBuffer encoded = encoder.encode(CharBuffer.wrap(secretCyrillicMessage));

            // 2) Якщо кодування вдалося, записуємо байти у файл.
            // Такий порядок гарантує, що у разі помилки кодування ми взагалі нічого не запишемо на диск.
            byte[] bytes = new byte[encoded.remaining()];
            encoded.get(bytes);
            Files.write(Paths.get(failFileName), bytes);

        } catch (CharacterCodingException e) {
            // Якщо кирилицю не можна зберегти в ISO-8859-1 — виводимо потрібне повідомлення
            System.out.println("Помилка запису: неможливо зберегти кирилицю в ISO-8859-1");
            // У файл нічого не пишемо — некоректних даних не буде
        }
    }
}