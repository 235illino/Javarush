package ua.javarush.java.core.level28.task10;

import java.util.LinkedHashMap;
import java.util.Map;

// Клас кешу, що реалізує стратегію LRU через LinkedHashMap
// accessOrder=true — порядок ітерації за мірою використання (доступу), а не вставки
class GameAssetCache extends LinkedHashMap<Integer, String> {
    private static final int MAX_CAPACITY = 2;

    public GameAssetCache() {
        super(2, 0.75f, true);

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > MAX_CAPACITY;


    }
}