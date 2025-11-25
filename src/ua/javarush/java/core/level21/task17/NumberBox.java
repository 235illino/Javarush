package ua.javarush.java.core.level21.task17;

public class NumberBox implements Comparable<NumberBox>{
    private int i;

    public NumberBox(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public int compareTo(NumberBox other) {
        return Integer.compare(this.i, other.i);
    }
}
