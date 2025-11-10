package ua.javarush.java.core.level15.task03;

public class Solution {
    public static void main(String[] args) {
        // Створюємо учасника Іван, 25 років
        Person person = new Person("Іван", 25);

        // Намагаємося встановити некоректний вік (-5) — має з’явитися повідомлення про помилку,
        // а вік залишитися без змін
        person.setMemberAge(-5);
        System.out.println(person.getMemberAge()); // Очікується: 25

        // Тепер встановлюємо коректний вік (35)
        person.setMemberAge(35);
        System.out.println(person.getMemberAge()); // Очікується: 35
    }
}