package ua.javarush.java.core.level24.task18;

// Клас ресурсу, який потрібно коректно закривати
class MagicArtifact implements AutoCloseable{

    @Override
    public void close() {
        // Повідомлення, що підтверджує автоматичне вимкнення артефакта
        System.out.println("Магічний артефакт безпечно вимкнено");
    }
}

public class Solution {
    public static void main(String[] args) {
        // try-with-resources гарантує автоматичний виклик close()
        // навіть якщо всередині блоку станеться виняток
            try(MagicArtifact magicArtifact = new MagicArtifact()) {
                System.out.println("Триває робота з магічним артефактом");

            }
            // Тут могла б бути будь-яка логіка роботи з артефактом

        // На цей момент артефакт уже закритий, повідомлення виведено
    }
}