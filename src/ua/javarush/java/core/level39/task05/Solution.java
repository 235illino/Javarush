package ua.javarush.java.core.level39.task05;

import java.io.IOException;
import java.nio.file.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Папка зі звітами
        Path dataDir = Paths.get("data");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:A*.csv");
        try (var paths = Files.newDirectoryStream(dataDir, path -> Files.isRegularFile(path) && matcher.matches(path.getFileName()))) {
            for (Path entry : paths) {
                System.out.println(entry.getFileName().toString());
            }
        }

        // Фільтр для DirectoryStream:
        // 1) пропускаємо лише звичайні файли (не каталоги);
        // 2) ім’я файла має починатися з 'A' і закінчуватися на ".csv".
//        try(var paths = Files.newDirectoryStream(dataDir, filter)){
//            for (Path entry : paths) {
//                System.out.println(entry.getFileName().toString());
//            }
//        }


        // Перебираємо вміст папки "data" через DirectoryStream з нашим фільтром

    }
}