package ua.javarush.java.core.level22.task17;

public class Solution {
    public static void main(String[] args) {
        // Створюємо екземпляр record-класу для улюбленої книги
        Book favorite = new Book("Майстер і Маргарита", "Михайло Булгаков");

        // Виводимо інформацію про книгу.
        // Доступ до даних здійснюється через автоматично згенеровані методи-доступники title() і author().
        System.out.println("Книга: " + favorite.title());
        System.out.println("Автор: " + favorite.author());

        // Додатково: record має автогенерований toString()
        // System.out.println(favorite); // Приклад: Book[title=..., author=...]
    }
}