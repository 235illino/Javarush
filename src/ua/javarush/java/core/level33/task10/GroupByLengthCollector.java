package ua.javarush.java.core.level33.task10;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

class GroupByLengthCollector implements Collector<
        String,                          // тип елементів вхідного потоку
        Map<Integer, List<String>>,      // тип акумулятора (проміжного контейнера)
        Map<Integer, List<String>>> {    // кінцевий тип результату

    @Override
    public Supplier<Map<Integer, List<String>>> supplier() {
        // Створюємо LinkedHashMap, щоб зберегти порядок появи ключів (3, 4, 5)
        return LinkedHashMap::new;
    }

    @Override
    public BiConsumer<Map<Integer, List<String>>, String> accumulator() {
        // Додаємо рядок до списку за ключем — «довжиною»
        return (map, s) -> map
                .computeIfAbsent(s.length(), k -> new ArrayList<>())
                .add(s);
    }

    @Override
    public BinaryOperator<Map<Integer, List<String>>> combiner() {
        // Зливаємо дві часткові мапи (потрібно для паралельних потоків)
        return (left, right) -> {
            right.forEach((len, list) ->
                    left.computeIfAbsent(len, k -> new ArrayList<>()).addAll(list)
            );
            return left;
        };
    }

    @Override
    public Function<Map<Integer, List<String>>, Map<Integer, List<String>>> finisher() {
        // Акумулятор і результат одного типу — повертаємо як є
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        // Результат — це сам акумулятор (IDENTITY_FINISH).
        // UNORDERED не ставимо, оскільки зберігаємо порядок появи ключів.
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH));
    }
}