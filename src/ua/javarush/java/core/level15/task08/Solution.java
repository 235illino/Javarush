package ua.javarush.java.core.level15.task08;

// Клас Solution знаходиться в тому ж пакеті (default package), що й DigitalLibraryManager
public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт керівника цифрової бібліотеки
        DigitalLibraryManager manager = new DigitalLibraryManager();

        // Виклик public-методу — доступний усім
        manager.announceOpening();

        // Виклик protected-методу — доступний у тому ж пакеті (і в підкласах)
        manager.conductStaffMeeting();

        // Виклик package-private методу — доступний у тому ж пакеті
        manager.manageBookInventory();

        // Спроба виклику private-методу призведе до помилки компіляції,
        //manager.handleFinancialAudits();
    }
}