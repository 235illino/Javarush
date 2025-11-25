package ua.javarush.java.core.level15.task08;

// Клас, що моделює рівні доступу в цифровій бібліотеці
public class DigitalLibraryManager {

    // Доступний усім
    public void announceOpening() {
        System.out.println("Бібліотека відкрита для відвідувачів!");
    }

    // Доступний у межах пакета та в підкласах
    protected void conductStaffMeeting() {
        System.out.println("Проведено зібрання персоналу бібліотеки.");
    }

    // Package-private (без модифікатора): доступний тільки в межах пакета
    void manageBookInventory() {
        System.out.println("Інвентаризацію книг завершено.");
    }

    // Приватний метод: доступний тільки всередині цього класу
    private void handleFinancialAudits() {
        System.out.println("Фінансовий аудит успішно завершено.");
    }
}
