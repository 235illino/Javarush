package ua.javarush.java.core.level25.task08;

// Інтерфейс з обов’язковим методом paint(), default-методом і static-методом
interface Renderable {
    // Абстрактний метод: кожна реалізація відповідає за своє малювання
    void paint();

    // Default-метод: поведінка за замовчуванням, доступна всім реалізаціям
    default void adjustScale() {
        System.out.println("Розмір об’єкта скориговано за замовчуванням.");
    }

    // Статичний метод інтерфейсу: спільна утиліта, викликається через ім’я інтерфейсу
    static void validateColorPalette() {
        System.out.println("Кольорову палітру перевірено, усе гаразд!");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Найпростіша реалізація Renderable через анонімний клас
        Renderable shape = new Renderable() {
            @Override
            public void paint() {
                // Імітуємо малювання об’єкта
                System.out.println("Малювання об’єкта: простий квадрат.");
            }
        };

        // Викликаємо обов’язковий метод малювання
        shape.paint();

        // Демонстрація default-методу інтерфейсу
        shape.adjustScale();

        // Виклик статичного методу безпосередньо через інтерфейс
        Renderable.validateColorPalette();
    }
}