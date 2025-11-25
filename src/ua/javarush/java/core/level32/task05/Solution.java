package ua.javarush.java.core.level32.task05;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Дві вихідні множини підозрюваних із різних джерел
        Set<String> suspectsFromSourceA = Set.of("Анна", "Борис", "Віктор", "Дмитро", "Олена");
        Set<String> suspectsFromSourceB = Set.of("Віктор", "Олена", "Жанна", "Ігор", "Павло");

        // Симетрична різниця множин через Stream API:
        // (A \ B) ∪ (B \ A) — тобто залишаємо лише тих, хто трапляється рівно в одній із множин

        var uniqueLeads = Stream.concat(
                suspectsFromSourceA.stream().filter(x -> !suspectsFromSourceB.contains(x)),
                        suspectsFromSourceB.stream().filter(x -> !suspectsFromSourceA.contains(x))
                ).collect(Collectors.toSet());
        // Виведення результату
        System.out.println(uniqueLeads);
    }
}