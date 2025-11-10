package ua.javarush.java.core.level24.task08;

// Головний клас із точкою входу та методом tryAddItem
public class Solution {

    // Метод намагається "додати" value предметів за ліміту limit
    // Якщо value > limit — кидаємо наш користувацький виняток із деталями
    public static void tryAddItem(int value, int limit) throws StorageCapacityExceededException {
            if(value > limit){
                throw new StorageCapacityExceededException("Перевищено допустимий ліміт", value, limit);
            }
            // Формуємо зрозуміле повідомлення та передаємо разом із деталями


        // Якщо все гаразд — просто повідомляємо про успіх
        System.out.println("Операція успішна!");
    }

    public static void main(String[] args) {
        try {
            // Моделюємо спробу додати 150 за ліміту 100
            tryAddItem(150, 100);
        } catch (StorageCapacityExceededException e) {
            // Перехоплюємо і виводимо повідомлення про помилку та точні деталі
            System.out.println("Помилка: " + e.getMessage());
            System.out.println("Поточне значення: " + e.getCurrentItemCount());
            System.out.println("Ліміт: " + e.getMaximumCapacity());
        }
    }
}