package ua.javarush.java.core.level14.task09;

public class Cat {
    private String catName;
    private int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }

    @Override
    public String toString() {
        return String.format("%s %d", catName, catAge);
    }
}
