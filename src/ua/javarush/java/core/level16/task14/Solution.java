package ua.javarush.java.core.level16.task14;

public class Solution {
    public static void main(String[] args) {
        // Демонстрація роботи SecretKeeper
        SecretKeeper keeper = new SecretKeeper();
        keeper.revealSecret();
    }
}

// Клас-охоронець секрету
class SecretKeeper {
    // Приватне поле з секретом
    private String hiddenSecret = "Java — круто!";

    // Метод, усередині якого оголошується локальний клас
    public void revealSecret() {
        // Локальний клас, оголошений усередині методу
        class TruthRevealer{
            void printSecret(){
                System.out.println(hiddenSecret);
            }
        }
        new TruthRevealer().printSecret();

        // Створюємо об’єкт локального класу та розкриваємо секрет

    }
}