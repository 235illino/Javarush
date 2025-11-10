package ua.javarush.java.core.level21.task12;

public class C implements A, B {

    public void show() {
        A.super.show();
        B.super.show();
    }
}
