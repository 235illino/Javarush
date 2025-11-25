package ua.javarush.java.core.level16.task05;

public class Solution {
    public static void main(String[] args) {
        // Створюємо екземпляр статичного вкладеного класу
        // Важливо: обʼєкт зовнішнього класу Spellbook не потрібен
        Spellbook.BasicCharm charm = new Spellbook.BasicCharm();

        // Активуємо заклинання
        charm.castSpell();
    }
}