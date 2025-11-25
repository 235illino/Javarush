package ua.javarush.java.core.level36.task04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Імена вхідних файлів із зашифрованими повідомленнями
        String file1 = "досье_А.txt";
        String file2 = "досье_Б.txt";

        // Множина для зберігання унікальних рядків із першого файлу (для швидкого пошуку)
        Set<String> secrets1 = new LinkedHashSet<>();
        // Множина для зберігання знайдених спільних секретів (збереже порядок першого входження)
        Set<String> commonSecrets = new LinkedHashSet<>();

        // Читаємо перше досьє рядок за рядком і зберігаємо кожен рядок у secrets1
        try(BufferedReader bf = Files.newBufferedReader(Paths.get(file1), StandardCharsets.UTF_8)) {
            String s;
            while ((s = bf.readLine()) != null){
                secrets1.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader bf = Files.newBufferedReader(Paths.get(file2), StandardCharsets.UTF_8)) {
            String s;
            while ((s = bf.readLine()) != null){
                if(secrets1.contains(s))
                    commonSecrets.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Читаємо друге досьє рядок за рядком і перевіряємо, чи траплявся рядок у першому досьє


        // Виводимо лише ті рядки, які присутні в обох досьє
        for (String secret : commonSecrets) {
            System.out.println(secret);
        }
    }
}