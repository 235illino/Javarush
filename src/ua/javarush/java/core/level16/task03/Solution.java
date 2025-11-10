package ua.javarush.java.core.level16.task03;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт бібліотеки
        Library library = new Library();

        // Створюємо об’єкт нестатичного внутрішнього класу через об’єкт зовнішнього класу
        // Синтаксис library.new Scroll(...) обов’язковий для non-static inner класів
        Library.Scroll scroll = library.new Scroll("Ancient Runes");

        // Показуємо назву сувою
        scroll.revealTitle();
    }
}