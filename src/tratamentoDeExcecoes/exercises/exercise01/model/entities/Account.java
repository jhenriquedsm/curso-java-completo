package tratamentoDeExcecoes.exercises.exercise01.model.entities;

import tratamentoDeExcecoes.exercises.exercise01.model.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withDraw(Double amount) throws AccountException {
        if (amount > balance){
            throw new AccountException("Not enough balance");
        }
        if (amount > withdrawLimit){
            throw new AccountException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }
}