package ua.javarush.java.core.level22.task16;

public record Transaction(String producer, String consumer, double sum) {
    public Transaction {
        if(sum <= 0 || producer == null || producer.isEmpty() ||
        consumer == null || consumer.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

    public String describe() {
        return String.format("Переказ %.2f від %s до %s", sum, producer, consumer);
    }
}
