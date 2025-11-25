package ua.javarush.java.core.level27.task04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Створюємо множину HashSet<String> для зберігання технологій
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("javascript");
        var iter = set.iterator();
        while(iter.hasNext()){
            var el = iter.next();
            if(el.contains("+")) iter.remove();
        }
        for (var el : set){
            System.out.println(el);
        }
        //set.forEach(System.out::println);

        // Додаємо назви технологій


        // Видаляємо елементи, що містять символ '+', використовуючи ітератор


        // Виводимо решту елементів множини, кожен з нового рядка (порядок не гарантується)

    }
}