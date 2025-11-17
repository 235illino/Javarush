package ua.javarush.java.core.level32.task06;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Три множини артефактів із перетинами
        Set<Integer> siteOneArtifacts = Set.of(101, 102, 103, 110, 120);
        Set<Integer> siteTwoArtifacts = Set.of(103, 104, 105, 120, 130);
        Set<Integer> siteThreeArtifacts = Set.of(105, 106, 107, 130, 140);

        // Об’єднання всіх артефактів із трьох множин.
        // Stream.of(...) збирає три множини в потік, flatMap «розплющує» їх в один потік ID,
        // далі Collectors.toCollection(TreeSet::new) — збираємо у відсортовану множину для наочного виведення.
        var allUniqueArtifacts = Stream.of(siteOneArtifacts,
                siteTwoArtifacts,
                siteThreeArtifacts).
                flatMap(Collection::stream).
                collect(Collectors.toCollection(TreeSet::new));

        // Артефакти, що трапляються суто на одній ділянці:
        // 1) «Плаский» потік усіх ID із трьох множин
        // 2) Групуємо за ID і рахуємо, скільки разів він трапився серед трьох множин (counting)
        // 3) Залишаємо ті, у кого лічильник рівно 1 (тобто трапляється лише в одній множині)
        // 4) Збираємо ключі (ID) у відсортовану множину
        var exclusiveSiteFinds = Stream.of(siteOneArtifacts, siteTwoArtifacts, siteThreeArtifacts)
                .flatMap(Set::stream)
                .collect(Collectors.groupingBy(
                        Integer::intValue,    // ключ групування — сам ID
                        Collectors.counting() // скільки разів трапився серед трьох множин
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(TreeSet::new));

        // Виведення результатів
        System.out.println("allUniqueArtifacts: " + allUniqueArtifacts);
        System.out.println("exclusiveSiteFinds: " + exclusiveSiteFinds);
    }
}