package ua.javarush.java.core.level26.task07;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // TreeSet автоматично сортує рядки за алфавітом і не допускає дублікатів
        Set<String> set = new TreeSet<>();
        set.add("Борис");
        set.add("Олексій");
        set.add("Віктор");

        set.forEach(System.out::println);

        // Додай перших трьох зареєстрованих (порядок додавання довільний)


        // Виведи список учасників в алфавітному порядку

    }
}