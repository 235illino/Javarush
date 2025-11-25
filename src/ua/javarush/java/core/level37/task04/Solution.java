package ua.javarush.java.core.level37.task04;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Задана фраза з різномовними символами та емодзі
        String multilingualPhrase = "AБВΓéü😀";

        // Імена файлів під різні кодування
        String utf8FileName = "test_utf8.txt";
        String utf16FileName = "test_utf16.txt";
        String latin1FileName = "test_latin1.txt";

        // 1) Записуємо рядок в UTF-8 і вимірюємо розмір файла
        Path utf8Path = Path.of(utf8FileName);
        Files.writeString(utf8Path, multilingualPhrase, StandardCharsets.UTF_8);
        long sizeUtf8 = Files.size(utf8Path);

        // 2) Записуємо рядок в UTF-16 (з BOM) і вимірюємо розмір файла
        Path utf16Path = Path.of(utf16FileName);
        Files.writeString(utf16Path, multilingualPhrase, StandardCharsets.UTF_16);
        long sizeUtf16 = Files.size(utf16Path);

        // 3) Намагаємося записати рядок в ISO-8859-1
        // За замовчуванням Java замінює непідтримувані символи на '?',
        // тому явно налаштовуємо енкодер на REPORT, щоб отримати помилку кодування.
        Path latin1Path = Path.of(latin1FileName);
        boolean isoSaved = false;
        long sizeLatin1 = 0;

        try {
            CharsetEncoder encoder = StandardCharsets.ISO_8859_1.newEncoder()
                    .onMalformedInput(CodingErrorAction.REPORT)      // якщо вхід «зіпсований» — кидаємо виняток
                    .onUnmappableCharacter(CodingErrorAction.REPORT); // якщо символ не можна закодувати — кидаємо виняток

            // Пробуємо закодувати весь рядок одразу — при першому непредставимому символі буде виняток
            ByteBuffer encoded = encoder.encode(CharBuffer.wrap(multilingualPhrase));

            // Копіюємо байти з ByteBuffer у масив і записуємо у файл
            byte[] data = new byte[encoded.remaining()];
            encoded.get(data);
            Files.write(latin1Path, data);

            isoSaved = true;
            sizeLatin1 = Files.size(latin1Path);
        } catch (CharacterCodingException e) {
            // Деякі символи (кирилиця, грецький і емодзі) не подані в ISO-8859-1
            // Повідомляємо про помилку кодування згідно з вимогою
        }

        // Виведення результатів вимірювань
        System.out.println("UTF-8: " + sizeUtf8 + " байтів");
        System.out.println("UTF-16: " + sizeUtf16 + " байтів");
        if (isoSaved) {
            System.out.println("ISO-8859-1: " + sizeLatin1 + " байтів");
        } else {
            System.out.println("ISO-8859-1: неможливо зберегти рядок — помилка кодування");
        }
    }
}