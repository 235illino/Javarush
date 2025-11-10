package ua.javarush.java.core.level20.task11;

public class MultiAction implements InterfaceA, InterfaceB{
    @Override
    public void doAction() {
        System.out.println("Виконано дію для обох інтерфейсів");
    }
}
