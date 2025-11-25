package ua.javarush.java.core.level21.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо пристрій і демонструємо роботу методів
        MyCounter device = new MyCounter();
        device.increment(); // має вивести "Counter incremented"
        device.reset();     // має вивести "Counter reset"
    }
}