package ua.javarush.java.core.level21.task19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список товарів з різними назвами й цінами
        List<Product> products = new ArrayList<>();
        products.add(new Product("Телевізор", 55000));
        products.add(new Product("Телефон", 35000));
        products.add(new Product("Ноутбук", 80000));

        // Тимчасове сортування за назвою.
        //products.sort((a,b) -> a.getName().compareTo(b.getName()));
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        // Виведення відсортованого списку (за абеткою назв)
        for (Product p : products) {
            System.out.println(p.getName());
        }
    }
}