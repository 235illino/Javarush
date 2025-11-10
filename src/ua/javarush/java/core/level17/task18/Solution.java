package ua.javarush.java.core.level17.task18;

public class Solution {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printSecret(); // виведе 42 — коректний доступ через публічний метод

        // Виклик нижче демонстраційний. Сам файл не скомпілюється через помилки в Child,
        new Child().demo();
    }
}