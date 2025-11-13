package ua.javarush.java.core.level28.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Solution {
    public static void main(String[] args) {
        // Формуємо початковий список тварин
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");

        // Отримуємо ListIterator для безпечного проходження та модифікації списку
        ListIterator<String> iterator = animals.listIterator();
        while (iterator.hasNext()){
            var el = iterator.next();
            if(el.length() == 3){
                iterator.remove();
                iterator.add("pet");
            }
        }

        // Ітеруємося списком

        

        // Після оброблення виводимо підсумковий список на екран
        System.out.println(animals);
    }
}