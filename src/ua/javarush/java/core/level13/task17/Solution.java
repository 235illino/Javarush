package ua.javarush.java.core.level13.task17;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Отримуємо сьогоднішню дату
        LocalDate today = LocalDate.now();
        LocalDate holidayCountdownStart = today.plusDays(10);
        System.out.println(holidayCountdownStart);


        // Додаємо до неї 10 днів, щоб дізнатися дату початку зворотного відліку


        // Виводимо результат на екран

    }
}