package ua.javarush.java.core.level13.task12;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1) Створюємо ZonedDateTime для 1 червня 2025 року, 12:00 у зоні Europe/Minsk
        ZonedDateTime originalEventTime = ZonedDateTime.of(2025, 6, 1, 12, 0, 0, 0, ZoneId.of("Europe/Minsk"));

        Instant universalInstant = originalEventTime.toInstant();
        ZoneId zone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime eventTimeTokyoZoned = universalInstant.atZone(zone);

        System.out.println(originalEventTime);
        System.out.println(universalInstant);
        System.out.println(eventTimeTokyoZoned);


        // 2) Перетворюємо ZonedDateTime на абсолютну мить Instant (UTC, часовий пояс не впливає)


        // 3) Той самий Instant відображаємо як локальний час для зони Asia/Tokyo


        // 4) Виводимо всі три значення

    }
}