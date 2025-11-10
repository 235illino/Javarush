package ua.javarush.java.core.level24.task15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {



            // Намагаємося відкрити файл — тут може виникнути FileNotFoundException
            try(FileReader fileReader = new FileReader("ff.txt")){

            } catch (FileNotFoundException e) {
                System.out.println("Секретний документ не знайдено!");
            } catch (IOException e) {
                System.out.println("Помилка доступу до архіву!");
            }

        // Легка перевірка доступу: читаємо перший байт (може повернути -1, якщо файл порожній)

            // Навмисно провокуємо більш загальну помилку введення-виведення



            // Важливо: цей catch іде ПЕРЕД IOException, інакше код не скомпілюється

            // Обробка всіх інших помилок введення-виведення


    }
}