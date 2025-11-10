package ua.javarush.java.core.level23.task15;

public class Solution {
    public static void main(String[] args) {
        // Поліморфна змінна базового типу «Appliance»
        Appliance homeAppliance = new Kettle();

        // Перед викликом специфічного методу перевіряємо реальний тип приладу
        if (homeAppliance instanceof Kettle) {
            // Безпечне приведення типу після instanceof
            Kettle kettle = (Kettle) homeAppliance;
            kettle.boil(); // Виведе: «Вода закипіла»
        }
    }
}