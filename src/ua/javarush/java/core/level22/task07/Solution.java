package ua.javarush.java.core.level22.task07;

public class Solution {
    public static void main(String[] args) {
        // Ініціалізуємо початкову точку (3, 7)
        Point start = new Point(3, 7);

        // Створюємо нову точку зі зміщенням по горизонталі на 2, вертикаль залишаємо незмінною
        Point moved = new Point(start.horizontal() + 2, start.vertical());

        // Виводимо обидві точки: спочатку початкову, потім нову
        System.out.println(start);
        System.out.println(moved);
    }
}