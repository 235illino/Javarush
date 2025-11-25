package ua.javarush.java.core.level29.task06;

import java.util.Objects;

public class City implements Comparable<City>{
    private final String cityName;
    private final int cityPopulation;

    public City(String cityName, int cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityPopulation == city.cityPopulation && Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, cityPopulation);
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(this.cityPopulation, o.cityPopulation);
    }
}
