package ua.javarush.java.core.level34.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Змінюваний кошик товарів
        List<String> cart = new ArrayList<>();
        cart.add("товар X");
        cart.add("товар Y");

        // Захищене представлення (обгортка) над кошиком:
        var cartWrap = Collections.unmodifiableList(cart);
        List<String> list = List.copyOf(cart);
        cart.add("товар Z");
        System.out.println(cartWrap);
        System.out.println(list);

        // Незалежна копія кошика (знімок на поточний момент):


        // Додаємо новий товар до вихідного кошика вже після створення представлень


        // Демонстрація відмінностей:
        // Обгортка покаже доданий елемент, знімок — ні.


        // Буде помилка (UnsupportedOperationException), оскільки protectedView — лише для читання:

    }
}