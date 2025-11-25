package ua.javarush.java.core.level27.task08;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // Основний складський реєстр: упорядкована множина з навігаційними методами
        NavigableSet<Integer> navi = new TreeSet<>();
        navi.add(10);
        navi.add(20);
        navi.add(30);
        navi.add(40);
        navi.add(50);
        NavigableSet<Integer> sub = navi.subSet(20, true, 50, false);
        sub.remove(30);
        System.out.println(sub);
        System.out.println(navi);
        // Додаємо ідентифікатори товарів


        // Формуємо «подання» на частину реєстру: від 20 (включно) до 50 (невключно)
        // subSet у NavigableSet повертає подання (view), пов’язане з вихідною множиною


        // Видаляємо пошкоджений товар 30 з тимчасового списку — зміна відобразиться і в реєстрі


        // Спочатку виводимо тимчасовий список відвантаження, потім основний реєстр

    }
}