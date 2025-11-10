package ua.javarush.java.core.level22.task10;

public class Solution {
    public static void main(String[] args) {
        // Створюємо дві точки з абсолютно однаковими координатами
        Point point1 = new Point(40.7128, -74.0060);
        Point point2 = new Point(40.7128, -74.0060);

        // Порівняння об’єктів через equals (метод автоматично згенерований у record)
        boolean equalsResult = point1.equals(point2);

        // Порівняння їхніх хеш-кодів (hashCode також автоматично генерується у record)
        boolean sameHash = point1.hashCode() == point2.hashCode();

        // Виводимо обидва результати: очікується true і true
        System.out.println(equalsResult);
        System.out.println(sameHash);
    }
}