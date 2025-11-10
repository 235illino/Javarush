package ua.javarush.java.core.level22.task01;

public class Solution {
    public static void main(String[] args) {
        // Створюємо картку для улюбленої книги, заповнюючи обидва поля
        BookCard favorite = new BookCard("Майстер і Маргарита", "Михайло Булгаков");

        // Виводимо всі деталі книги на екран
        System.out.println("Назва: " + favorite.title());
        System.out.println("Автор: " + favorite.author());
    }
}