package ua.javarush.java.core.level34.task06;

import java.util.concurrent.CopyOnWriteArrayList;

public class Solution {
    public static void main(String[] args) {
        // Створюємо потокобезпечний список, що підтримує "знімок" під час ітерації
        CopyOnWriteArrayList<String> eventLog = new CopyOnWriteArrayList<>();

        // Додаємо початкові події до початку ітерації
        eventLog.add("Подія A");
        eventLog.add("Подія B");
        eventLog.add("Подія C");

        // Ідемо по колекції за допомогою for-each.
        for (var event : eventLog){
            //System.out.println(event);
            eventLog.add("Нова подія D");
        }


        // Після завершення циклу виводимо підсумковий вміст колекції:
        // тут будуть видні додані під час ітерації елементи "Нова подія D"
        System.out.println("Підсумковий стан журналу подій:");
        System.out.println(eventLog);

    }
}