package ua.javarush.java.core.level35.task08;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        System.out.println("Вибери режим роботи (append/overwrite):");
        String mode = console.nextLine().trim().toLowerCase();

        System.out.println("Введи текст налаштувань:");
        String settings = console.nextLine();
        Path path = Path.of("app_settings.conf");
        // Якщо користувач увів "append" — будемо дозаписувати в кінець файлу,
        // будь-яке інше введення трактуємо як "overwrite" (перезапис).
        if(mode.equals("append")){
            Files.write(path, List.of(settings), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } else {
            Files.write(path, List.of(settings), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }


        // FileWriter із прапором append керує режимом запису:
        // append = true  -> дозапис у кінець (зберігаємо старий вміст);
        // append = false -> перезапис (очищаємо файл і пишемо лише нові дані).

    }
}