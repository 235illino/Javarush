package ua.javarush.java.core.level28.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо змінюваний список з початковими значеннями
        List<Integer> list = new ArrayList<>(List.of(5, -3, 8, -1, 0, 4, -7));
        var iter = list.iterator();
        while(iter.hasNext()){
            var el = iter.next();
            if(el < 0) iter.remove();
        }
        System.out.println(list);


        // Обходимо список за допомогою Iterator, щоб безпечно видаляти елементи під час обходу


        // Виводимо оновлений список без від’ємних чисел

    }
}