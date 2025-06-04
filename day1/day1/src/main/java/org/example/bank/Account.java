package org.example.bank;

import java.util.Objects;

public class Account {
    // Properties
    private int id;
    private int balance;

    // Constructors
    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    // Public methods
    public void addToBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.id;
    }

    // Private methods


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
