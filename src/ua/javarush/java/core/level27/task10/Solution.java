package ua.javarush.java.core.level27.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // Метод приймає список-приймач з типом ? super String,
    // що дає змогу безпечно додавати до нього рядки,
    // навіть якщо фактичний тип списку більш загальний (наприклад, Object).
    public static void addStrings(List<? super String> list, List<String> values) {
        // Додаємо всі повідомлення разом — згідно з вимогою використовуємо addAll
        list.addAll(values);

    }

    public static void main(String[] args) {
        // Універсальний журнал подій: може зберігати будь-які об’єкти
        ArrayList<Object> eventLog = new ArrayList<>();

        // Тестові рядкові повідомлення
        List<String> messages = Arrays.asList(
                "Систему запущено",
                "Помилка бази даних",
                "Операцію завершено"
        );

        // Додаємо рядки до універсального журналу через метод із wildcard ? super String
        addStrings(eventLog, messages);

        // Перевіряємо результат: виводимо вміст журналу
        System.out.println(eventLog);
    }
}