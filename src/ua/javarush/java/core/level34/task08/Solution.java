package ua.javarush.java.core.level34.task08;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо змінний внутрішній список рядків — наш плейлист
        List<String> myFirstPlaylist = new ArrayList<>();

        var allPlaylists = List.of(myFirstPlaylist);
        try {
            allPlaylists.add(new ArrayList<>());
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException");
        }
        myFirstPlaylist.add("hello");



        // Створюємо зовнішній незмінний список з єдиним елементом — посиланням на myFirstPlaylist


        // Демонстрація неможливості зміни зовнішнього списку:
        // спроба додати новий плейлист призводить до UnsupportedOperationException


        // Змінюємо вміст внутрішнього списку після того, як зовнішній уже став незмінним


        // Виводимо обидва списки: видно, що внутрішній змінився, а зовнішній усе ще містить один плейлист
        System.out.println("allPlaylists = " + allPlaylists);
        System.out.println("myFirstPlaylist = " + myFirstPlaylist);
    }
}