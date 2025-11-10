package ua.javarush.java.core.level21.task20;

public class Solution {
    public static void main(String[] args) {
        // Використовуємо try-with-resources: ресурс буде закрито автоматично
        try(DemoResource demoResource = new DemoResource()) {
            System.out.println("Робота з ресурсом");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}