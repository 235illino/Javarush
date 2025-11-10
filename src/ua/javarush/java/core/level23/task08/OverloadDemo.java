package ua.javarush.java.core.level23.task08;

public class OverloadDemo {
    public void print(int valueToPrint){
        System.out.println("int: " + valueToPrint);
    }
    public void print(double valueToPrint){
        System.out.println("double: " + valueToPrint);
    }
}
