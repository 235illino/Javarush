package ua.javarush.java.core.level14.task08;

public class BankAccount {
    private String accountOwner;
    private int accountBalance;

    public BankAccount(String accountOwner, int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountOwner) {
        this(accountOwner, 0);
    }

    public void deposit(int amount){
        accountBalance += amount;
    }

    public void printInfo(){
        System.out.printf("Власник: %s, баланс: %d\n", accountOwner, accountBalance);
    }
}
