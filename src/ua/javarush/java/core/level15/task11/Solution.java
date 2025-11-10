package ua.javarush.java.core.level15.task11;

// Клас Solution — точка входу в програму
public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт «розумної лампи» (за замовчуванням вимкнена)
        SmartLamp lamp = new SmartLamp();

        // Увімкнюємо лампу
        lamp.setCurrentlyOn(true);

        // Перевіряємо стан через boolean-гетер і виводимо результат
        System.out.println(lamp.isCurrentlyOn());
    }
}

// Клас SmartLamp інкапсулює стан лампи