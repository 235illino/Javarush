package ua.javarush.java.core.level16.task06;

public class Vault {
    // Приватне статичне поле — спільний рівень безпеки для всього сховища
    private static int securityLevel = 100;

    public static class SecurityDisplayUnit{

        public void showSecurityLevel() {
            System.out.println(securityLevel);
        }
    }
    // Публічний статичний вкладений клас — не потребує об’єкта Vault для створення


    public static void main(String[] args) {
        // Створюємо об’єкт вкладеного класу без створення об’єкта Vault
        SecurityDisplayUnit display = new SecurityDisplayUnit();
        // Показуємо поточний рівень безпеки
        display.showSecurityLevel();
    }
}