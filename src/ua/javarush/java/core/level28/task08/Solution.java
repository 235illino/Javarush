package ua.javarush.java.core.level28.task08;

import java.util.EnumMap;

// Перелічення днів тижня
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Solution {
    public static void main(String[] args) {
        // Спеціалізована мапа для ключів enum: працює швидко й заощаджує памʼять
        EnumMap<Day, Integer> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MON, 100);
        enumMap.put(Day.TUE, 120);
        enumMap.put(Day.SAT, 200);

        // Заповнюємо ціни згідно з умовою
        System.out.println(enumMap.get(Day.SAT));


        // Отримуємо ціну на суботу й виводимо на екран

    }
}