package ua.javarush.java.core.level33.task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Звичайний змінний список — майстер-список інгредієнтів
        List<String> masterRecipeIngredients = new ArrayList<>();
        masterRecipeIngredients.add("Java");
        masterRecipeIngredients.add("Python");

        var apprenticeRecipeView = Collections.unmodifiableList(masterRecipeIngredients);
        masterRecipeIngredients.add("C++");
        // Незмінне представлення (обгортка) поверх майстер-списку.
        // Це не копія, а «вид» на початковий список: зміни в майстер-списку будуть видимі тут.


        // Змінюємо початковий майстер-список після створення представлення


        // Виводимо вміст «гостьового меню»: має бути [Java, Python, C++]
        // Безпосередньо змінювати apprenticeRecipeView не можна — він незмінний.
        System.out.println(apprenticeRecipeView);
    }
}