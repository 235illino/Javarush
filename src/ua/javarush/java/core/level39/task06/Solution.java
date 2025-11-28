package ua.javarush.java.core.level39.task06;

import java.io.IOException;
import java.nio.file.*;

public class Solution {
    // PathMatcher із регулярним виразом і прапорцем (?i) — ігноруємо регістр розширення
    // Зіставляємо імена, що закінчуються на .png або .jpg (будь-який регістр)
    private static final PathMatcher matcher =
            FileSystems.getDefault().getPathMatcher("regex:(?i).*\\.(png|jpg)");

    public static void main(String[] args) throws IOException {
        // Точка старту — папка "images" поруч із програмою
        Path start = Paths.get("images");

        // Якщо папки немає або це не директорія — нічого обходити
        if (!Files.isDirectory(start)) {
            return; // за умовою виводимо лише знайдені шляхи
        }

        // Рекурсивно обходимо всю структуру папок
        scan(start);
    }

    // Рекурсивний обхід каталогу:
    // - використовуємо DirectoryStream із фільтром, щоб проходити лише по директоріях
    //   і тих файлах, що підходять за розширенням;
    // - для директорій — заглиблюємося далі (рекурсія),
    // - для відповідних файлів — друкуємо абсолютний шлях.
    private static void scan(Path dir) throws IOException {
        // Фільтр: пропускаємо директорії та файли .png/.jpg (без урахування регістру)
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, path -> Files.isDirectory(path) || (Files.isRegularFile(path) && matcher.matches(path.getFileName())))) {
            for (Path entry : stream) {
                if(Files.isRegularFile(entry))
                    System.out.println(entry.toAbsolutePath());
                else
                    scan(entry);
            }
        }


    }
}