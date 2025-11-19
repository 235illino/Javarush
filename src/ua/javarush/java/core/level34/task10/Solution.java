package ua.javarush.java.core.level34.task10;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class Solution {
    public static void main(String[] args) {
        // Створюємо змінювану колекцію, яка підтримує інтерфейс SequencedCollection (Java 21+)
        SequencedCollection<String> algorithmSteps = new ArrayList<>();
        algorithmSteps.add("Крок A");
        algorithmSteps.add("Крок B");
        algorithmSteps.add("Крок C");
        var reversedStepsView = algorithmSteps.reversed();
        // Отримуємо зворотне подання. Важливо: це "живе" подання, а не копія.
        reversedStepsView.add("Новий крок D");

        // Додаємо новий елемент через зворотне подання.
        // Додавання в кінець reversed-подання відповідає додаванню на початок вихідної колекції.


        // Демонструємо, що зміни через reversedStepsView відобразилися у вихідній колекції
        System.out.println("Початкова послідовність algorithmSteps:");
        printInline(algorithmSteps);

        System.out.println("\nЗворотне подання reversedStepsView:");
        printInline(reversedStepsView);
    }

    // Утилітний метод для компактного виводу вмісту колекції в порядку ітерації
    private static void printInline(Iterable<String> iterable) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;
        for (String s : iterable) {
            if (!first) sb.append(", ");
            sb.append(s);
            first = false;
        }
        sb.append("]");
        System.out.println(sb);
    }
}