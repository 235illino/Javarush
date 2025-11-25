package ua.javarush.java.core.level17.task16;

public class Cat extends Mammal{
    @Override
    public void eat() {
        System.out.println(super.animalName + " їсть рибу.");
    }
    public void purr(){
        System.out.println(super.animalName + " муркоче.");
    }
}
