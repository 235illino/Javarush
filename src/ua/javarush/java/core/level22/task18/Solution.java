package ua.javarush.java.core.level22.task18;

public class Solution {
    public static void main(String[] args) {
        // Створюємо дві точки з однаковими координатами
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);

        // Порівнюємо точки за допомогою equals, згенерованого record-класом
        boolean same = p1.equals(p2);

        // Виводимо результат порівняння
        System.out.println(same);
    }
}