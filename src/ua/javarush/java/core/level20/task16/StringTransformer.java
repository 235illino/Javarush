package ua.javarush.java.core.level20.task16;
@FunctionalInterface
public interface StringTransformer {
    String transform(String s);
    default void printTransformed(String s){
        System.out.println(transform(s));
    }
}
