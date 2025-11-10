package ua.javarush.java.core.level14.task14;

public class Solution {
    public static void main(String[] args) {
        // Реєструємо анонімного користувача (конструктор без параметрів)
        User user1 = new User();
        User user2 = new User("Аліса");
        System.out.println(user1.getUserName());
        System.out.println(user1.getUserAge());
        System.out.println(user2.getUserName());
        System.out.println(user2.getUserAge());


        // Реєструємо користувача з ім’ям "Аліса" (конструктор з одним параметром)


        // Виводимо значення полів кожного користувача

    }
}