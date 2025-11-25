package ua.javarush.java.core.level17.task11;

public class Cat extends Animal{
    public String name = "Кішка";
    public void printNames(){
        System.out.println("Імʼя з Cat: " + this.name);
        System.out.println("Імʼя з Animal: " + super.name);
    }
}
