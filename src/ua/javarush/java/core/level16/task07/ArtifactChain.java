package ua.javarush.java.core.level16.task07;

public class ArtifactChain {
    private Link head;
    // Посилання на початок ланцюжка (голову списку)
    private static class Link{
        int value;
        Link next;

        public Link(int value) {
            this.value = value;
        }
    }
    void addArtifact(int artifactValue){
        Link link = new Link(artifactValue);
        link.next = head;
        head = link;
    }
    void displayChain(){
        var curr = head;
        while(curr != null){
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
    // Приватний статичний вкладений клас — окрема ланка ланцюжка.
    // static: ланка не зберігає неявне посилання на зовнішній об’єкт ArtifactChain.


    // Додаємо новий артефакт на початок ланцюжка (у голову списку)


    // Проходимо по всьому ланцюжку і виводимо значення кожної ланки


    public static void main(String[] args) {
        // Створюємо ланцюжок артефактів
        ArtifactChain chain = new ArtifactChain();

        // Додаємо артефакти у вказаному порядку
        chain.addArtifact(5);
        chain.addArtifact(10);
        chain.addArtifact(15);

        // Виводимо весь ланцюжок (очікується порядок: 15, 10, 5 — оскільки додаємо на початок)
        chain.displayChain();
    }
}