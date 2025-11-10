package ua.javarush.java.core.level21.task13;

public interface StringChecker {
    static boolean isEmpty(String s){
        return s == null || s.isEmpty();
    }
}
