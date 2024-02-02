package poo.exercises.exercise4.entities;

public class BankAccount {
    private int numberAccount;
    private String holder;
    private double balance;

    public BankAccount(int numberAccount, String holder) {
        this.numberAccount = numberAccount;
        this.holder = holder;
    }

    public BankAccount(int numberAccount, String holder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
            this.balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account " + getNumberAccount() +
                ", Holder: " + getHolder() +
                ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
