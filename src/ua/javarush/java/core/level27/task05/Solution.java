package ua.javarush.java.core.level27.task05;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Створюємо чергу завдань на основі LinkedList
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(15);
        queue.add(25);
        System.out.println(queue.peek());
        System.out.println(queue.size());

        // Додаємо ідентифікатори завдань у вказаному порядку


        // Отримуємо перший елемент без видалення з черги (peek не змінює чергу)


        // Виводимо ідентифікатор наступного завдання


        // Виводимо поточний розмір черги

    }
}