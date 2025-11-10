package ua.javarush.java.core.level20.task02;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну універсального типу інтерфейсу Drawable — "інструмент для малювання"
        Drawable tool = new Circle(); // Присвоюємо їй конкретну фігуру — коло

        // Викликаємо метод draw() через змінну інтерфейсного типу
        tool.draw(); // Очікуваний вивід: "Drawing a circle"
    }
}