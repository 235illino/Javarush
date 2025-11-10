package ua.javarush.java.core.level20.task20;

public class Person implements Subscriber{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(String.format("%s отримав новину: %s", this.name, news));
    }
}
