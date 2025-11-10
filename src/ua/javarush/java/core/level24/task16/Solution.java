package ua.javarush.java.core.level24.task16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Фонова служба логування запущена.");

        try {
            // Створюємо тимчасовий каталог і навмисно використовуємо його як шлях до "файлу" логу.
            var tempDir = Files.createTempDirectory("myDir");
            saveEvent("Very important info", tempDir);

            // Імітуємо запис важливої події до лог-файлу


            // До цього рядка виконання не дійде через виняток, викинутий вище

        } catch (IOException e) {
            e.printStackTrace();
            // Блок catch не порожній — тут друкується повний стек викликів.

        }

        System.out.println("Демонстрацію завершено.");
    }

    // Рівень бізнес-логіки: збереження події делегує фактичний запис.
    private static void saveEvent(String message, Path logFile) throws IOException {
        writeLog(logFile, message);
    }

    // Низькорівневий метод: спроба запису за вказаним шляхом.
    private static void writeLog(Path logFile, String text) throws IOException {
        // Намагаємося записати рядок. У нашій демонстрації logFile вказує на каталог - буде виняток
        Files.writeString(logFile, text + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}