package ua.javarush.java.core.level21.task04;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Solution {
    public static void main(String[] args) {
        // Фіксований префікс для всіх звітних рядків
        String pref = "Результат: ";
        IntFunction<String> fun = a -> pref + (a*2);
        //Function<Integer, String> fun = a -> pref + (a*2);
        System.out.println(fun.apply(7));


        // Лямбда-вираз — "функція форматування":


        // Виклик функції з аргументом 7 і виведення результату

    }
}