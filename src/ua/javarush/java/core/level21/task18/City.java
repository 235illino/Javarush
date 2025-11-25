package ua.javarush.java.core.level21.task18;

public class City implements Comparable<City>{
    private final String name;
    private final int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(this.population, o.population);
    }
}
