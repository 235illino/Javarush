package ua.javarush.java.core.level28.task06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Створюємо та заповнюємо HashMap результатами учасників
        HashMap<String, Integer> results = new HashMap<>();
        results.put("A", 1);
        results.put("B", 2);
        results.put("C", 3);
        results.put("D", 4);

        var iter = results.entrySet().iterator();
        while(iter.hasNext()){
            var el = iter.next().getValue();
            if(el%2 == 0) iter.remove();
        }

        // Отримуємо ітератор за набором записів (entrySet)


        // Йдемо по кожній парі «учасник-бал»


            // Якщо бал парний — безпечно видаляємо через ітератор



        // Виводимо очищену мапу на екран
        System.out.println(results);
    }
}