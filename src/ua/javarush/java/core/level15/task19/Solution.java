package ua.javarush.java.core.level15.task19;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два об’єкти, щоб побачити порядок ініціалізації:
        // 1) Під час першого завантаження класу виконуються статичні блоки (один раз),
        // 2) Далі для кожного об’єкта — обидва нестатичні блоки в порядку оголошення,
        // 3) Після цього — конструктор.
        new SystemComponent();
        new SystemComponent();
    }
}