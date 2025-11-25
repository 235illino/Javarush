package ua.javarush.java.core.level25.task07;

public class Solution {
    // Універсальна «злітна смуга»: приймає будь-який об’єкт, який уміє літати
    public static void launchIntoSky(CanFly flyingObject) {
        // Поліморфний виклик: конкретний soar() визначається у переданого об’єкта
        flyingObject.soar();
    }

    public static void main(String[] args) {
        // Створюємо літальні об’єкти різних типів
        Aircraft aircraft = new Aircraft();
        Eagle eagle = new Eagle();

        // Запускаємо їх у небо через універсальну злітну смугу
        launchIntoSky(aircraft);
        launchIntoSky(eagle);
    }
}