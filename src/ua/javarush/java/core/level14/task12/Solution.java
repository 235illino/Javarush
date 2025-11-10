package ua.javarush.java.core.level14.task12;

public class Solution {
    public static void main(String[] args) {
        // "Реєструємо" книгу без початкових даних — спрацює конструктор за замовчуванням
        Book book1 = new Book();
        Book book2 = new Book("Java для початківців", 350);
        System.out.println(book1);
        System.out.println(book2);
        // "Реєструємо" книгу з готовими даними


        // Показуємо інформацію про кожну книгу у потрібному форматі

    }
}