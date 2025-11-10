package ua.javarush.java.core.level13.task10;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1. Створюємо «локальний» час без прив’язки до часового поясу:
        // 1 червня 2025 року, 14:00
        LocalDateTime conferenceStartLocal = LocalDateTime.of(2025, 6, 1, 14, 0);
        ZonedDateTime conferenceStartMinskZoned = conferenceStartLocal.atZone(ZoneId.of("Europe/Minsk"));
        System.out.println(conferenceStartMinskZoned);

        // 2. Обираємо часовий пояс Europe/Minsk


        // 3. Прив’язуємо локальний час до обраного поясу, отримуємо ZonedDateTime


        // 4. Виводимо результат для перевірки (наприклад: 2025-06-01T14:00+03:00[Europe/Minsk])

    }
}