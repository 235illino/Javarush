package ua.javarush.java.core.level35.task10;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Шлях до директорії "game_assets" у поточному робочому каталозі
        Path assetsDir = Paths.get("game_assets");

        // Створюємо директорію, якщо її ще немає
        Files.createDirectories(assetsDir);

        // Шляхи до файлів-заглушок усередині директорії
        Path characterModel = assetsDir.resolve("character_model.obj");
        Path environmentTexture = assetsDir.resolve("environment_texture.png");
        if(!Files.exists(characterModel)) Files.createFile(characterModel);
        if(!Files.exists(environmentTexture)) Files.createFile(environmentTexture);
        if (Files.exists(assetsDir) && Files.isDirectory(assetsDir)) {
            try (var stream = Files.list(assetsDir)) {
                stream.forEach(path -> System.out.println(path.getFileName()));
            }
        }
        // Створюємо порожні файли, якщо їх ще не існує


        // Перелічуємо вміст директорії: імена файлів/папок построково
        // Використовуємо DirectoryStream, щоб пройтися елементами папки без зайвих залежностей

    }
}