package ua.javarush.java.core.level20.task08;

public class Solution {
    public static void main(String[] args) {
        // Створюємо смартфон і послідовно викликаємо його дії
        SmartPhone phone = new SmartPhone();
        phone.turnOn();
        phone.work();
        phone.charge();
    }
}