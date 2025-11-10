package ua.javarush.java.core.level22.task20;

public class Solution {
    public static void main(String[] args) {
        // Створюємо "гнучкий" профіль (звичайний клас)
        FlexibleUser flexible = new FlexibleUser("Іван", 30);
        System.out.println("Гнучкий профіль (до змін): " + flexible);

        // Змінюємо ім’я та вік за допомогою сетерів
        flexible.setName("Петро");
        flexible.setAge(25);
        System.out.println("Гнучкий профіль (після змін): " + flexible);

        // Створюємо "фіксований" профіль (record)
        FixedUser fixed = new FixedUser("Анна", 28);
        System.out.println("Фіксований профіль (record): " + fixed);

//        fixed.setName("Марія");   // Помилка компіляції: у record немає сетера setName
//        fixed.age = 29;           // Помилка компіляції: поле age недоступне і final
//        fixed.name("Марія");      // Помилка компіляції: метод name() — гетер без параметрів
    }
}