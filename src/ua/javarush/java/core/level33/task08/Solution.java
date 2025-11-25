package ua.javarush.java.core.level33.task08;

import java.util.List;
import java.util.Spliterator;

public class Solution {
    public static void main(String[] args) {
        // 1) Створюємо список із шести різних завдань
        List<String> projectTasks = List.of(
                "Дизайн",
                "Розробка",
                "Тестування",
                "Документація",
                "Розгортання",
                "Моніторинг"
        );

        // 2) Отримуємо Spliterator для всього списку
        var alphaTasks = projectTasks.spliterator();
        var betaTasks = alphaTasks.trySplit();



        // 3) Ділимо початковий сплітератор на дві частини.
        // trySplit() повертає нову частину (приблизно половину),
        // а в alphaTasks лишаються решта елементів.


        // 4) Виводимо завдання, які дісталися кожній команді.
        // За нашим розподілом:
        // - Команда Альфа отримує ті елементи, що лишилися в початковому spliterator (alphaTasks)
        // - Команда Бета отримує ті елементи, які повернув trySplit() (betaTasks)
        System.out.println("Команда Альфа:");
        alphaTasks.forEachRemaining(System.out::println);

        System.out.println();
        System.out.println("Команда Бета:");
        if(betaTasks != null) betaTasks.forEachRemaining(System.out::println);


    }
}