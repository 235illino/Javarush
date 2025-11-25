package ua.javarush.java.core.level15.task01;

public class Solution {
    public static void main(String[] args) {
        // Створюємо екземпляр класу Person
        Person person = new Person();

        // Нижче — навмисні спроби прямого доступу до приватних полів.
//        person.memberName = "Alice"; // Помилка компіляції: memberName має модифікатор private
//        person.memberAge = 30;       // Помилка компіляції: memberAge має модифікатор private

        // Демонстраційне повідомлення
        System.out.println("Створено екземпляр Person. Прямий доступ до полів memberName і memberAge заборонено (private).");
    }
}