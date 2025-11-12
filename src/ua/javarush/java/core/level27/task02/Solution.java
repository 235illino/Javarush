package ua.javarush.java.core.level27.task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // List зберігає всі предмети, включно з повторами
        List<Integer> nums = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        nums.add(3);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        set.add(3);
        set.add(7);
        set.add(3);
        set.add(9);
        System.out.println(nums.size());
        System.out.println(set.size());


        // Set зберігає лише унікальні предмети (повтори ігноруються)


        // Додай ідентифікатори 3, 7, 3, 9 до обох колекцій


        // Виведи кількість: спочатку загальну (List), потім унікальну (Set)

    }
}