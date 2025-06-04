package org.example.bank;

public class Account {
    private int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void addToBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
