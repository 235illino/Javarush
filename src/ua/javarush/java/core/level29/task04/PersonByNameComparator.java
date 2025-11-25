package ua.javarush.java.core.level29.task04;

import java.util.Comparator;

public class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPersonName().compareTo(o2.getPersonName());
    }
}
