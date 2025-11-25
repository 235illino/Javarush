package ua.javarush.java.core.level16.task19;

// Універсальна пара даних: клас для зберігання двох пов’язаних елементів одного типу
class DataPair<T> {
    // Два приватні поля узагальненого типу T
    private T firstElement;
    private T secondElement;

    public DataPair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }
    public T getFirst(){
        return this.firstElement;
    }

    public T getSecond(){
        return this.secondElement;
    }
    // Конструктор приймає два значення та ініціалізує поля


    // Повертаємо перший елемент пари


    // Повертаємо другий елемент пари

}

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт DataPair для рядків і передаємо "Hello" і "World"
        DataPair<String> pair = new DataPair<>("Hello", "World");

        // Виводимо обидва значення через пробіл
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}