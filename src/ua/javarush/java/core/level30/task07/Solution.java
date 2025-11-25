package ua.javarush.java.core.level30.task07;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Список усіх учнів (приклад даних)
        List<String> students = List.of(
                "Анна", "Борис", "Олексій", "Марія",
                "Андрій", "Віктор", "Артур", "Галина", "Аліса", "Дмитро"
        );
        students.stream().filter(x -> x.startsWith("А")).forEach(System.out::println);

        // Проходимо потік імен, лишаємо лише ті, що починаються на 'А',
        // і одразу виводимо кожне ім’я на екран.
        // Важно: не збираємо відфільтровані імена в нову колекцію.

    }
}