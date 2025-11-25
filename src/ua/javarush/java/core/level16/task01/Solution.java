package ua.javarush.java.core.level16.task01;

public class Solution {
    public static void main(String[] args) {
        // Створюємо коробку
        Box box = new Box();

        // Створюємо етикетку, пов’язану з цією коробкою.
        // Для створення екземпляра внутрішнього класу потрібен екземпляр зовнішнього класу.
        Box.Label label = box.new Label();

        // Викликаємо метод друку етикетки
        label.printLabel();
    }
}