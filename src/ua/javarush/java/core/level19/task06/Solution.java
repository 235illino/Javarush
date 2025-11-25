package ua.javarush.java.core.level19.task06;

public class Solution {
    public static void main(String[] args) {
        // Створюємо «розумний» пристрій — телефон
        Phone phone = new Phone();

        // Увімкнемо телефон (спосіб увімкнення індивідуальний для кожного пристрою)
        phone.turnOn();

        // Вимикаємо пристрій (загальний алгоритм для всіх пристроїв)
        phone.turnOff();
    }
}