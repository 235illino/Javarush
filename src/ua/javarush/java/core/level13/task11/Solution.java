package ua.javarush.java.core.level13.task11;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // Локальна дата-час телепорта (без прив’язки до часового поясу)
        LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6, 1, 18, 0);
        ZoneId minskZone = ZoneId.of("Europe/Minsk");
        ZonedDateTime teleportTimeMinskZoned = teleportScheduledLocal.atZone(minskZone);
        ZonedDateTime teleportTimeNewYorkZoned = teleportTimeMinskZoned.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(teleportTimeMinskZoned);
        System.out.println(teleportTimeNewYorkZoned);


        // Часовий пояс Мінська


        // Прив’язуємо локальний час до Мінська — отримуємо конкретну мить


        // Переводимо ту саму мить у часовий пояс Нью-Йорка


        // Виводимо обидва значення, щоб побачити різницю представлень однієї миті

    }
}