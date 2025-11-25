package ua.javarush.java.core.level34.task09;

import java.util.ArrayDeque;
import java.util.SequencedCollection;

public class Solution {
    public static void main(String[] args) {
        // Створюємо порожню SequencedCollection<String>.
        // ArrayDeque реалізує Deque, а Deque у Java 21+ розширює SequencedCollection.
        SequencedCollection<String> taskQueue = new ArrayDeque<>();
        if(taskQueue.isEmpty()) System.out.println("Колекція завдань порожня");
        else {
            System.out.println(taskQueue.getFirst());
            System.out.println(taskQueue.getLast());
        }

        // Перед зверненням до елементів завжди перевіряємо, чи порожня колекція.

    }
}