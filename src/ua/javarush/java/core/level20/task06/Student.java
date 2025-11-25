package ua.javarush.java.core.level20.task06;

public class Student extends Person implements Identifiable {
    public Student(String name) {
        super(name);
    }

    public void printInfo() {
        System.out.println(this.getName());
        System.out.println(ID);
    }
}
