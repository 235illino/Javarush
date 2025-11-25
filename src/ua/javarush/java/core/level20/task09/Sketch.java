package ua.javarush.java.core.level20.task09;

public class Sketch implements Drawable, Erasable{
    @Override
    public void draw() {
        System.out.println("Малюнок створено");
    }

    @Override
    public void erase() {
        System.out.println("Малюнок стерто");
    }
}
