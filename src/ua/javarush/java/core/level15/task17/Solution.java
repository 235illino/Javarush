package ua.javarush.java.core.level15.task17;

public class Solution {
    public static void main(String[] args) {
        // Створення об’єкта спровокує завантаження класу (якщо ще не завантажений)
        // і виконає статичний блок рівно один раз.
        new ApplicationModule();

        // Жодного додаткового виводу тут бути не повинно.
    }
}