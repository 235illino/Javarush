package ua.javarush.java.core.level34.task07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 1) Змінюваний інвентар домашніх тварин
        List<String> petInventory = new ArrayList<>();
        petInventory.add("кішка");
        petInventory.add("собака");

        // 2) "Живе" представлення: відображає зміни вихідного списку,
        //    але напряму змінити його не можна (спроба = UnsupportedOperationException)
        var livePetView = Collections.unmodifiableList(petInventory);
        var snapshotPetList = List.copyOf(petInventory);

        try {
            livePetView.add("миша");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException");
        }
        try {
            snapshotPetList.add("миша");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException");
        }




        petInventory.add("миша");
        System.out.println(livePetView);
        System.out.println(snapshotPetList);




        // 3) "Знімок" поточного стану: незалежна незмінна копія на момент створення


        // 4) До вихідного інвентарю додається новий мешканець


        // 5) Виводимо вміст представлень
        //    livePetView покаже зміни, snapshotPetList залишиться незмінним


        // 6) Демонстрація заборони змін через представлення:
        //    обидві спроби призведуть до UnsupportedOperationException

    }
}