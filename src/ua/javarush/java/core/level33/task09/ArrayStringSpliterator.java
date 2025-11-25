package ua.javarush.java.core.level33.task09;

import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayStringSpliterator implements Spliterator<String> {
    private final String[] languages;
    private int i;
    private final int length;

    public ArrayStringSpliterator(String[] languages, int i, int length) {
        this.languages = languages;
        this.i = i;
        this.length = length;
    }

    @Override
    public boolean tryAdvance(Consumer<? super String> action) {
        if (i < length) {
            action.accept(languages[i++]);
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<String> trySplit() {
        // Ділимо решту діапазону навпіл:
        // ліва половина віддається новому Spliterator, поточний зсувається до середини.
        int lo = i;
        int mid = (lo + length) >>> 1; // безпечне ділення навпіл
        if (lo >= mid) {
            return null; // замало елементів для ділення
        }
        i = mid; // поточний тепер починає з середини
        return new ArrayStringSpliterator(languages, lo, mid);
    }

    @Override
    public long estimateSize() {
        return length - i;
    }

    @Override
    public int characteristics() {
        return ORDERED | SIZED | SUBSIZED | IMMUTABLE | NONNULL;
    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        // Швидкий прохід решти діапазону
        while (i < length) {
            action.accept(languages[i++]);
        }
    }
}
