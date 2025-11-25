package ua.javarush.java.core.level28.task10;

public class Solution {
    public static void main(String[] args) {
        // Створюємо кеш із порядком за доступом (LRU)
        GameAssetCache cache = new GameAssetCache();

        // Додаємо асети
        cache.put(1, "one");
        cache.put(2, "two");

        // "Використовуємо" асет з ключем 1 — він стає найщойно використаним
        cache.get(1);

        // Додаємо асет 3 — це спровокує видалення того, який найдовше не використовувався (2)
        cache.put(3, "three");

        // Виводимо ключі асетів, що залишилися, у порядку від менш до більш "свіжих"
        for (Integer id : cache.keySet()) {
            System.out.println(id);
        }
    }

}