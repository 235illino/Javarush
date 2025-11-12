package ua.javarush.java.core.level27.task06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Черга друку на основі ArrayDeque (FIFO)
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Кіт");
        queue.add("Пес");
        queue.add("Миша");
        System.out.println("Черга:");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Deque<Character> stack = new ArrayDeque<>();
        stack.add('X');
        stack.add('Y');
        stack.add('Z');
        System.out.println("Стек:");
        while (!stack.isEmpty()){
            System.out.println(stack.pollLast());
        }

        // Стек історії дій на основі ArrayDeque (LIFO)

        // Використовуємо push для додавання на вершину стека


        // Вивід черги: спочатку заголовок, далі дістаємо (poll) елементи у порядку FIFO


        // Вивід стека: спочатку заголовок, далі знімаємо (pop) елементи у порядку LIFO

    }
}