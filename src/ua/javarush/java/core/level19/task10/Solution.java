package ua.javarush.java.core.level19.task10;

// Бібліотека геометричних фігур: абстракція + конкретні реалізації
public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкти конкретних фігур
        Figure square = new Square(4); // квадрат зі стороною 4
        Figure circle = new Circle(3); // коло з радіусом 3

        // Викликаємо area() у кожної фігури й виводимо результат
        System.out.println(square.area());
        System.out.println(circle.area());
    }
}