package ua.javarush.java.core.level20.task20;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо видавця
        NewsPublisher publisher = new NewsPublisher();

        // Створюємо двох підписників із різними іменами
        Person andrey = new Person("Андрей");
        Person boris = new Person("Борис");

        // Підписуємо їх на новини
        publisher.addSubscriber(andrey);
        publisher.addSubscriber(boris);

        // Сповіщаємо всіх підписників про нову новину
        publisher.notifySubscribers("Оновлення курсу Java!");
    }
}